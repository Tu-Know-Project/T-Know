package com.example.t_know.mapPage

import BaseFragment
import android.os.Bundle
import android.view.View
import com.example.t_know.R

import com.example.t_know.databinding.FragmentMapInfoBinding

class MapInfoFragment : BaseFragment<FragmentMapInfoBinding>(
    R.layout.fragment_map_info,
    FragmentMapInfoBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
