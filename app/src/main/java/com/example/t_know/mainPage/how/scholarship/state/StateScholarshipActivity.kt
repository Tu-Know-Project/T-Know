package com.example.t_know.mainPage.how.scholarship.state

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowScholarshipOffMainBinding
import com.example.t_know.databinding.ActivityHowScholarshipStateMainBinding
import com.example.t_know.mainPage.what.integrated.academic.AcademicFragmentPagerAdapter

class StateScholarshipActivity : BaseActivity<ActivityHowScholarshipStateMainBinding>(
    ActivityHowScholarshipStateMainBinding::inflate
){
    private val adapter by lazy {
        StateScholarshipFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            stateScholarshipPager.adapter = adapter
        }
    }
}