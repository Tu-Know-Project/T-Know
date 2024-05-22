package com.example.t_know.mainPage.how.comute.five

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.how.comute.three.OneThreeComuteFragment
import com.example.t_know.mainPage.how.comute.three.TwoThreeComuteFragment

class FiveComuteFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragments : List<Fragment>
    init {
        fragments= listOf(
            OneFiveComuteFragment(),
            TwoFiveComuteFragment(),

            )
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}