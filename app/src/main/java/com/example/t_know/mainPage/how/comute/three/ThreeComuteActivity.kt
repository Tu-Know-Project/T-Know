package com.example.t_know.mainPage.how.comute.three

import BaseActivity
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowComute3400MainBinding

class ThreeComuteActivity : BaseActivity<ActivityHowComute3400MainBinding>(
    ActivityHowComute3400MainBinding::inflate
){
    private val adapter by lazy {
        ThreeComuteFragmentPagerAdapter(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initTab()
    }

    private fun initTab() {
        with(binding) {
            threeComutePager.adapter = adapter
        }
    }
}