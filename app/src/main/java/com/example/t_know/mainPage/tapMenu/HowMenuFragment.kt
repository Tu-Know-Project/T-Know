package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentHowMenuBinding

class HowMenuFragment : BaseFragment<FragmentHowMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentHowMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
