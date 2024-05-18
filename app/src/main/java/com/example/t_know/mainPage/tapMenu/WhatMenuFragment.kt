package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentWhatMenuBinding
import com.example.t_know.mainPage.what.integrated.IntegratedMainActivity


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


    }


}
