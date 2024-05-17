package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentPlaceMenuBinding


class PlaceMenuFragment : BaseFragment<FragmentPlaceMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentPlaceMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
