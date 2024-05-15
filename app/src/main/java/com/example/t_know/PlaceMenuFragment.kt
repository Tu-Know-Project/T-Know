package com.example.t_know

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.t_know.databinding.FragmentPlaceMenuBinding


class PlaceMenuFragment : Fragment() {
    lateinit var binding: FragmentPlaceMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentPlaceMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_place_menu, container, false)
    }

}