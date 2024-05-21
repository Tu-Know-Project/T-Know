package com.example.t_know.mainPage.how.scholarship.off

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowScholarshipOffMainBinding
import com.example.t_know.mainPage.what.integrated.academic.AcademicFragmentPagerAdapter

class OffScholarshipActivity : BaseActivity<ActivityHowScholarshipOffMainBinding>(
    ActivityHowScholarshipOffMainBinding::inflate
){
    private val adapter by lazy {
        AcademicFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            offScholarshipPager.adapter = adapter
        }
    }
}