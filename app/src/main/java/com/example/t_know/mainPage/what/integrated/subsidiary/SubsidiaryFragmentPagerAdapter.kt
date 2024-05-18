package com.example.t_know.mainPage.what.integrated.subsidiary

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SubsidiaryFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneSubsidiaryFragment(),
            TwoSubsidiaryFragment(),

        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}