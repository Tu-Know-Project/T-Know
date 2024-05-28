package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentEatMenuBinding
import com.example.t_know.mapPage.MapActivity

class EatMenuFragment : BaseFragment<FragmentEatMenuBinding>(
    R.layout.fragment_eat_menu,
    FragmentEatMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMap.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 10)
            startActivity(intent)
        }

        binding.btnSchoolFood.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 30)
            intent.putExtra("category_code", 31)
            startActivity(intent)
        }
        binding.btnCafe.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 30)
            intent.putExtra("category_code", 32)
            startActivity(intent)
        }

    }
}
