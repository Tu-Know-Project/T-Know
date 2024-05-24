package com.example.t_know.mainPage.how.lib.use

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowLibUseMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class UseLibActivity : BaseActivity<ActivityHowLibUseMainBinding>(
    ActivityHowLibUseMainBinding::inflate
){
    private val adapter by lazy {
        UseLibFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            useLibPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.useLibPager){tab, positon ->
            }.attach()
        }
    }
}