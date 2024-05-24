package com.example.t_know.mainPage.what.ucheck

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatUcanplusTipscholarshipMainBinding
import com.example.t_know.databinding.ActivityWhatUcheckMainBinding
import com.example.t_know.mainPage.what.ucanplus.tipscholarship.TipFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class UcheckMainActivity : BaseActivity<ActivityWhatUcheckMainBinding>(
    ActivityWhatUcheckMainBinding::inflate){

    private val adapter by lazy {
        UcheckFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            ucheckPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.ucheckPager){tab, positon ->
            }.attach()
        }
    }
}