package com.example.t_know.mainPage.how.comute.five

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowComute3400MainBinding
import com.example.t_know.databinding.ActivityHowComute5200MainBinding
import com.example.t_know.mainPage.how.comute.three.ThreeComuteFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class FiveComuteActivity : BaseActivity<ActivityHowComute5200MainBinding>(
    ActivityHowComute5200MainBinding::inflate
){
    private val adapter by lazy {
        FiveComuteFragmentAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            fifComutePager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.fifComutePager){tab, positon ->
            }.attach()
        }
    }
}