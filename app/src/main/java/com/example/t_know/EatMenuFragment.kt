package com.example.t_know

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.t_know.databinding.FragmentEatMenuBinding

class EatMenuFragment : Fragment() {
    lateinit var binding: FragmentEatMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentEatMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_eat_menu, container, false)
    }

}