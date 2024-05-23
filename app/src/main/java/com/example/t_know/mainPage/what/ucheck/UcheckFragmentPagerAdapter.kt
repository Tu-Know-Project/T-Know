package com.example.t_know.mainPage.what.ucheck

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.what.ucanplus.tipscholarship.OneTipScholarshipFragment
import com.example.t_know.mainPage.what.ucanplus.tipscholarship.TwoTipScholarshipFragment

class UcheckFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneUcheckFragment(),
            TwoUcheckFragment(),
            ThreeUcheckFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}