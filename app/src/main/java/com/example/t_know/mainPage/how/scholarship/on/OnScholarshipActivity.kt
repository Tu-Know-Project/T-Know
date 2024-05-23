package com.example.t_know.mainPage.how.scholarship.on

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowScholarshipOffMainBinding
import com.example.t_know.databinding.ActivityHowScholarshipOnMainBinding
import com.example.t_know.mainPage.what.integrated.academic.AcademicFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class OnScholarshipActivity : BaseActivity<ActivityHowScholarshipOnMainBinding>(
    ActivityHowScholarshipOnMainBinding::inflate
){
    private val adapter by lazy {
        OnScholarshipFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            onScholarshipPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.onScholarshipPager){tab, positon ->
            }.attach()
        }
    }
}