package com.example.t_know.mainPage

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.t_know.mainPage.tapMenu.EatMenuFragment
import com.example.t_know.mainPage.tapMenu.HowMenuFragment
import com.example.t_know.mainPage.tapMenu.PlaceMenuFragment
import com.example.t_know.mainPage.tapMenu.WhatMenuFragment

class MainViewPager(activity: AppCompatActivity) : FragmentStateAdapter(activity){

    private val fragmentList = listOf(
        PlaceMenuFragment(),
        EatMenuFragment(),
        HowMenuFragment(),
        WhatMenuFragment()
    )

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}