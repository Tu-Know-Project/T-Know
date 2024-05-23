package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentWhatMenuBinding
import com.example.t_know.mainPage.what.call.CallMainActivity
import com.example.t_know.mainPage.what.integrated.IntegratedMainActivity
import com.example.t_know.mainPage.what.ucanplus.UcanPlusMainActivity
import com.example.t_know.mainPage.what.ucheck.UcheckMainActivity


class WhatMenuFragment : BaseFragment<FragmentWhatMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentWhatMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickWhatIcon()
    }

    private fun clickWhatIcon(){
        binding.btnTotalInfo.setOnClickListener {
            startActivity(Intent(activity, IntegratedMainActivity::class.java))
        }

        binding.btnCallList.setOnClickListener {
            startActivity(Intent(activity, CallMainActivity::class.java))
        }

        binding.btnUcan.setOnClickListener {
            startActivity(Intent(activity, UcanPlusMainActivity::class.java))
        }

        binding.btnUcheck.setOnClickListener {
            startActivity(Intent(activity, UcheckMainActivity::class.java))
        }

    }


}
