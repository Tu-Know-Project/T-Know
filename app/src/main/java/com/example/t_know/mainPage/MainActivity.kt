package com.example.t_know.mainPage

import BaseActivity
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.t_know.R
import com.example.t_know.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Calendar
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
        selectUsefullApp()
        moveTobiNyang()
        setTako()
    }
    private fun moveTobiNyang() {
        binding.tobicat.bringToFront()
        Glide.with(this).load("https://icon-library.com/images/cat-icon-gif/cat-icon-gif-1.jpg").into(binding.tobicat)
        val location = CoroutineScope(Dispatchers.Default)
        val startX = binding.tobicat.x
        val startY = binding.tobicat.y
        var rotate = true
        binding.tobicat.scaleX = -1f
        location.launch {
            while (true) {
                withContext(Dispatchers.Main) {
                    if (rotate) {

                        binding.tobicat.x += 1
                        if (binding.tobicat.x >= binding.root.width - binding.tobicat.width) {
                            binding.tobicat.x = (binding.root.width - binding.tobicat.width).toFloat()
                            binding.tobicat.scaleX = 1f
                            binding.tobicat.y = binding.tobicat.y + 20
                            rotate = false
                        }
                    } else {
                        binding.tobicat.x -= 1
                        if (binding.tobicat.x <= 0) {

                            binding.tobicat.x = 0f
                            binding.tobicat.scaleX = -1f
                            binding.tobicat.y = binding.tobicat.y + 20
                            rotate = true
                        }
                    }

                    if (binding.tobicat.y > binding.root.height - binding.tobicat.height) {
                        binding.tobicat.x = startX
                        binding.tobicat.y = startY
                    }
                }
                delay(1)
            }
        }
        binding.tobicat.setOnClickListener{
            val intent = Intent(this,TobiNyangActivity::class.java)
            startActivity(intent)
        }

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
        binding.menuSandol.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://pf.kakao.com/_pRxlZxb"))
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

    private fun selectUsefullApp(){
        binding.helloLms.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=kr.co.imaxsoft.hellolms&pcampaignid=web_share"))
            startActivity(intent)
        }
        binding.tukoreaPotal.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.kt.android.PolytechnicUniversity&pcampaignid=web_share"))
            startActivity(intent)
        }
        binding.overnight.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.ww8007.AutoOvernight"))
            startActivity(intent)
        }
        binding.ucheck.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.libeka.attendance.ucheckplusstud&pcampaignid=web_share"))
            startActivity(intent)
        }
    }
    private fun setTako() {
        val today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        if (today == Calendar.TUESDAY) {
            binding.menuTako.text = "오늘은 타코야끼 오는 날~"
            binding.takoModal.isVisible = true
        } else {
            binding.menuTako.text = "타코야끼는 화요일에 와요"
            binding.takoModal.isVisible = false
        }

        binding.menuTako.setOnClickListener {
            val dialog = TakoDialogFragment()
            dialog.show(supportFragmentManager, "TakoDialogFragment")
        }
        binding.takoModal.setOnClickListener {
            val dialog = TakoDialogFragment()
            dialog.show(supportFragmentManager, "TakoDialogFragment")
        }
    }

}
