package com.example.t_know.mainPage.what.integrated.academic

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AcademicFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneAcademicFragment(),
            TwoAcademicFragment(),
            ThreeAcademicFragment(),
            FiveAcademicFragment(),
            SixAcademicFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("size" , fragments.size.toString())
        return fragments[position]
    }

}