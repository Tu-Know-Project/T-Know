package com.example.t_know.mainPage.what.ucanplus.consulting

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatIntegratedInformationSubsidiaryAdministrationMainBinding
import com.example.t_know.databinding.ActivityWhatUcanplusConsultingMainBinding
import com.example.t_know.mainPage.what.integrated.subsidiary.SubsidiaryFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ConsultingActivity : BaseActivity<ActivityWhatUcanplusConsultingMainBinding>(
    ActivityWhatUcanplusConsultingMainBinding::inflate){

    private val adapter by lazy {
        SubsidiaryFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            consultingPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.consultingPager){tab, positon ->
            }.attach()
        }
    }
}