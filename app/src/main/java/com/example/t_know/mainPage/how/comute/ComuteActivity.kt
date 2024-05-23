package com.example.t_know.mainPage.how.comute

import BaseActivity
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.example.t_know.databinding.ActivityHowComuteMainBinding
import com.example.t_know.databinding.ActivityHowScholarshipMainBinding
import com.example.t_know.mainPage.how.comute.five.FiveComuteActivity
import com.example.t_know.mainPage.how.comute.six.SixComuteActivity
import com.example.t_know.mainPage.how.comute.three.ThreeComuteActivity
import com.example.t_know.mainPage.how.scholarship.off.OffScholarshipActivity
import com.example.t_know.mainPage.how.scholarship.on.OnScholarshipActivity
import com.example.t_know.mainPage.how.scholarship.state.StateScholarshipActivity

class ComuteActivity : BaseActivity<ActivityHowComuteMainBinding>(
    ActivityHowComuteMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.threeBtn.setOnClickListener{
            startActivity(Intent(this, ThreeComuteActivity::class.java))
        }

        binding.fifBtn.setOnClickListener {
            startActivity(Intent(this, FiveComuteActivity::class.java))
        }

        binding.sixBtn.setOnClickListener {
            startActivity(Intent(this, SixComuteActivity::class.java))
        }


    }

}