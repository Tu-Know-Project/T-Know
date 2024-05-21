package com.example.t_know.mainPage.how.scholarship.on

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.how.scholarship.off.OneOffScholarshipFragment

class OnScholarshipFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneOnScholarshipFragment(),
            TwoOnScholarshipFragment(),
            ThreeOnScholarshipFragment(),
            FourOnScholarshipFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}