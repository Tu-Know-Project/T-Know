package com.example.t_know.mainPage.what.ucanplus

import BaseActivity
import android.content.Intent
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatUcanplusMainBinding
import com.example.t_know.mainPage.what.ucanplus.consulting.ConsultingActivity
import com.example.t_know.mainPage.what.ucanplus.extra.ExtraActivity
import com.example.t_know.mainPage.what.ucanplus.tipscholarship.TipScholarshipActivity

class UcanPlusMainActivity : BaseActivity<ActivityWhatUcanplusMainBinding>(
    ActivityWhatUcanplusMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.extraCurricular.setOnClickListener{
            startActivity(Intent(this, ExtraActivity::class.java))
        }

        binding.consulting.setOnClickListener {
            startActivity(Intent(this, ConsultingActivity::class.java))
        }

        binding.tipPointScholarship.setOnClickListener {
            startActivity(Intent(this, TipScholarshipActivity::class.java))
        }

    }

}