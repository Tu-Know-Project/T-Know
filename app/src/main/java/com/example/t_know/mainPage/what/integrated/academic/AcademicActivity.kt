package com.example.t_know.mainPage.what.integrated.academic

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatIntegratedInformationAcademicAdministrationMainBinding

class AcademicActivity : BaseActivity<ActivityWhatIntegratedInformationAcademicAdministrationMainBinding>(
    ActivityWhatIntegratedInformationAcademicAdministrationMainBinding::inflate
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
            academicPager.adapter = adapter
        }
    }
}