package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.t_know.R
import com.example.t_know.databinding.FragmentHowMenuBinding
import com.example.t_know.databinding.FragmentWhatMenuBinding


class WhatMenuFragment : BaseFragment<FragmentWhatMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentWhatMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
