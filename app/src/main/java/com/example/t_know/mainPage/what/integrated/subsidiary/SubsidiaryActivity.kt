package com.example.t_know.mainPage.what.integrated.subsidiary

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatIntegratedInformationSubsidiaryAdministrationMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class SubsidiaryActivity : BaseActivity<ActivityWhatIntegratedInformationSubsidiaryAdministrationMainBinding>(
    ActivityWhatIntegratedInformationSubsidiaryAdministrationMainBinding::inflate){

    private val adapter by lazy {
        SubsidiaryFragmentPagerAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }
    private fun initTab() {
        with(binding) {
            subsidiaryPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.subsidiaryPager){tab, positon ->
            }.attach()
        }
    }
}