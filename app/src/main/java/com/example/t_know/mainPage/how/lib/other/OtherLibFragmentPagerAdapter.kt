package com.example.t_know.mainPage.how.lib.other

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.how.lib.use.OneUseLibFragment
import com.example.t_know.mainPage.how.lib.use.ThreeUseLibFragment
import com.example.t_know.mainPage.how.lib.use.TwoUseLibFragment

class OtherLibFragmentPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneOtherLibFragment(),
            TwoOtherLibFragment(),
        )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}