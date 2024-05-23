package com.example.t_know.mainPage.tapMenu

import BaseFragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.t_know.R
import com.example.t_know.databinding.FragmentPlaceMenuBinding
import com.example.t_know.mapPage.MapActivity


class PlaceMenuFragment : BaseFragment<FragmentPlaceMenuBinding>(
    R.layout.fragment_how_menu,
    FragmentPlaceMenuBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFacilities.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 20)
            intent.putExtra("category_code", 21)
            startActivity(intent)
        }
        binding.btnOffice.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 20)
            intent.putExtra("category_code", 22)
            startActivity(intent)
        }
        binding.btnSmokingArea.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 20)
            intent.putExtra("category_code", 23)
            startActivity(intent)
        }
        binding.btnOther.setOnClickListener {
            val intent = Intent(activity, MapActivity::class.java)
            intent.putExtra("intent_code", 20)
            intent.putExtra("category_code", 24)
            startActivity(intent)
        }
    }
}
