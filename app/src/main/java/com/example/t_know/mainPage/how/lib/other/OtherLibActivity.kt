package com.example.t_know.mainPage.how.lib.other

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowLibOtherMainBinding
import com.example.t_know.mainPage.how.lib.use.UseLibFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class OtherLibActivity : BaseActivity<ActivityHowLibOtherMainBinding>(
    ActivityHowLibOtherMainBinding::inflate
){
    private val adapter by lazy {
        OtherLibFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            otherLibPager.adapter = adapter
            TabLayoutMediator(binding.useTabLayout, binding.otherLibPager){tab, positon ->
            }.attach()
        }
    }
}