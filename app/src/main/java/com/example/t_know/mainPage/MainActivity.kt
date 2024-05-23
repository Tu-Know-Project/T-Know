package com.example.t_know.mainPage

import BaseActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.t_know.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private val adapter by lazy {
        MainViewPager(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
        startAutoScroll()
        updateShuttleTimes()
        likedMenu()

    }
    private fun getCurrentTime(): String {
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        return sdf.format(Date())
    }
    private fun initTab() {
        with(binding) {
            fragmentContainer.adapter = adapter
            TabLayoutMediator(storeFragmentTablayout, fragmentContainer) { tab, position ->
                tab.text = when (position) {
                    0 -> "어디있지?"
                    1 -> "뭐 먹지?"
                    2 -> "어떻게 해?"
                    3 -> "이건 뭐지?"
                    else -> ""
                }
            }.attach()
        }
    }

    private fun likedMenu(){

        binding.menuE.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ibook.kpu.ac.kr/Viewer/menu02"))
            startActivity(intent)
        }
        binding.menuTip.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://ibook.kpu.ac.kr/Viewer/menu01"))
            startActivity(intent)
        }
    }

    private fun startAutoScroll() {
        lifecycleScope.launch {
            while (isActive) {
                delay(5000)
                val currentPage = binding.fragmentContainer.currentItem
                val totalPages = binding.fragmentContainer.adapter?.itemCount ?: 0
                if (totalPages > 0) {
                    val nextPage = (currentPage + 1) % totalPages
                    binding.fragmentContainer.setCurrentItem(nextPage, true)
                }
            }
        }
    }

    private fun updateShuttleTimes(){
        lifecycleScope.launch {

            while (isActive){
                delay(1000)
                setShuttleTimes(getCurrentTime())
            }
        }
    }
    private fun setShuttleTimes(currentTime: String) {


        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        val currentDate = sdf.parse(currentTime)
        val outputFormat = SimpleDateFormat("a h시 m분", Locale.getDefault())

        val schoolStartTimeList = SchoolTime.schoolStartTimeList
        val schoolEndTimeList = SchoolTime.schoolEndTimeList

        val (closestSchoolStartTime, nextSchoolStartTime) = findClosestAndNextTime(currentTime, schoolStartTimeList, sdf)
        val (closestSchoolEndTime, nextSchoolEndTime) = findClosestAndNextTime(currentTime, schoolEndTimeList, sdf)

        val goSchoolTimesThisTimeRemain = calculateTimeDifference(currentDate, sdf.parse(closestSchoolStartTime))
        val goSchoolTimesNextTimeRemain = calculateTimeDifference(currentDate, sdf.parse(nextSchoolStartTime))
        val goHomeTimesThisTimeRemain = calculateTimeDifference(currentDate, sdf.parse(closestSchoolEndTime))
        val goHomeTimesNextTimeRemain = calculateTimeDifference(currentDate, sdf.parse(nextSchoolEndTime))

        val formattedClosestSchoolStartTime = outputFormat.format(sdf.parse(closestSchoolStartTime))
        val formattedNextSchoolStartTime = outputFormat.format(sdf.parse(nextSchoolStartTime))
        val formattedClosestSchoolEndTime = outputFormat.format(sdf.parse(closestSchoolEndTime))
        val formattedNextSchoolEndTime = outputFormat.format(sdf.parse(nextSchoolEndTime))

        binding.goSchoolTimesThisTimeDeparture.text = formattedClosestSchoolStartTime
        binding.goSchoolTimesThisTimeRemain.text = "$goSchoolTimesThisTimeRemain 분 전"
        binding.goSchoolTimesNextTimeDeparture.text = formattedNextSchoolStartTime
        binding.goSchoolTimesNextTimeRemain.text = "$goSchoolTimesNextTimeRemain 분 전"
        binding.goHomeTimesThisTimeDeparture.text = formattedClosestSchoolEndTime
        binding.goHomeTimesThisTimeRemain.text = "$goHomeTimesThisTimeRemain 분 전"
        binding.goHomeTimesNextTimeDeparture.text = formattedNextSchoolEndTime
        binding.goHomeTimesNextTimeRemain.text = "$goHomeTimesNextTimeRemain 분 전"

    }

    fun findClosestAndNextTime(currentTime: String, timeList: List<String>, sdf: SimpleDateFormat): Pair<String, String> {
        val currentDate = sdf.parse(currentTime)
        var closestTime: Date? = null
        var nextTime: Date? = null

        for (timeStr in timeList) {
            val time = sdf.parse(timeStr)
            if (time.after(currentDate)) {
                if (closestTime == null || Math.abs(time.time - currentDate.time) < Math.abs(closestTime!!.time - currentDate.time)) {
                    closestTime = time
                }
            }
        }

        if (closestTime != null) {
            val closestIndex = timeList.indexOf(sdf.format(closestTime))
            val nextIndex = (closestIndex + 1) % timeList.size
            nextTime = sdf.parse(timeList[nextIndex])
        }

        return Pair(sdf.format(closestTime), sdf.format(nextTime))
    }

    fun calculateTimeDifference(startDate: Date, endDate: Date): Long {
        val difference = endDate.time - startDate.time
        return difference / (1000 * 60)
    }
}
