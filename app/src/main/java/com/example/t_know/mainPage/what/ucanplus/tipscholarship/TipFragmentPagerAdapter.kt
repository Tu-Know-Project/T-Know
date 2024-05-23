package com.example.t_know.mainPage.what.ucanplus.tipscholarship

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.what.ucanplus.extra.OneExtraFragment
import com.example.t_know.mainPage.what.ucanplus.extra.ThreeExtraFragment
import com.example.t_know.mainPage.what.ucanplus.extra.TwoExtraFragment

class TipFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneTipScholarshipFragment(),
            TwoTipScholarshipFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}