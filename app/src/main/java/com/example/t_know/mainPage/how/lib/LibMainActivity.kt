package com.example.t_know.mainPage.how.lib

import BaseActivity
import android.content.Intent
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowLibMainBinding
import com.example.t_know.mainPage.how.lib.other.OtherLibActivity
import com.example.t_know.mainPage.how.lib.time.TimeLibActivity
import com.example.t_know.mainPage.how.lib.use.UseLibActivity

class LibMainActivity : BaseActivity<ActivityHowLibMainBinding>(
    ActivityHowLibMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.time.setOnClickListener{
            startActivity(Intent(this, UseLibActivity::class.java))
        }

        binding.other.setOnClickListener {
            startActivity(Intent(this, TimeLibActivity::class.java))
        }

        binding.use.setOnClickListener {
            startActivity(Intent(this, OtherLibActivity::class.java))
        }

    }
}