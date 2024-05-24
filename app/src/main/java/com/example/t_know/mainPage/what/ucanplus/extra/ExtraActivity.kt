package com.example.t_know.mainPage.what.ucanplus.extra

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatUcanplusConsultingMainBinding
import com.example.t_know.databinding.ActivityWhatUcanplusExtraMainBinding
import com.example.t_know.mainPage.what.integrated.subsidiary.SubsidiaryFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ExtraActivity : BaseActivity<ActivityWhatUcanplusExtraMainBinding>(
    ActivityWhatUcanplusExtraMainBinding::inflate){

    private val adapter by lazy {
        ExtraFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            extraUcanPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.extraUcanPager){tab, positon ->
            }.attach()
        }
    }
}