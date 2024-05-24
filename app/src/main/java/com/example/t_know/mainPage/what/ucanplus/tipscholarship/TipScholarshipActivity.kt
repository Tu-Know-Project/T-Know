package com.example.t_know.mainPage.what.ucanplus.tipscholarship

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatUcanplusExtraMainBinding
import com.example.t_know.databinding.ActivityWhatUcanplusTipscholarshipMainBinding
import com.example.t_know.mainPage.what.ucanplus.extra.ExtraFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class TipScholarshipActivity : BaseActivity<ActivityWhatUcanplusTipscholarshipMainBinding>(
    ActivityWhatUcanplusTipscholarshipMainBinding::inflate){

    private val adapter by lazy {
        TipFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            tipScholarshipPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.tipScholarshipPager){tab, positon ->
            }.attach()
        }
    }
}