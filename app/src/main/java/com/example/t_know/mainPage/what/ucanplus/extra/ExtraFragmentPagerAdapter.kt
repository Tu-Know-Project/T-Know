package com.example.t_know.mainPage.what.ucanplus.extra

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.what.integrated.subsidiary.OneSubsidiaryFragment
import com.example.t_know.mainPage.what.integrated.subsidiary.TwoSubsidiaryFragment

class ExtraFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneExtraFragment(),
            TwoExtraFragment(),
            ThreeExtraFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}