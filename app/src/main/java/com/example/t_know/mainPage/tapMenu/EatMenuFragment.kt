package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentEatMenuBinding

class EatMenuFragment : BaseFragment<FragmentEatMenuBinding>(
    R.layout.fragment_eat_menu,
    FragmentEatMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
