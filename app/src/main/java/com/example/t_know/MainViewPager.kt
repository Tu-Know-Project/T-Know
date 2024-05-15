package com.example.t_know

import android.app.Activity
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

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