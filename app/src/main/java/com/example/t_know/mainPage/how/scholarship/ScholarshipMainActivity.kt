package com.example.t_know.mainPage.how.scholarship

import BaseActivity
import android.content.Intent
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowScholarshipMainBinding
import com.example.t_know.mainPage.how.scholarship.off.OffScholarshipActivity
import com.example.t_know.mainPage.how.scholarship.on.OnScholarshipActivity
import com.example.t_know.mainPage.how.scholarship.state.StateScholarshipActivity

class ScholarshipMainActivity : BaseActivity<ActivityHowScholarshipMainBinding>(ActivityHowScholarshipMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.onScholarship.setOnClickListener{
            startActivity(Intent(this, OnScholarshipActivity::class.java))
        }

        binding.offScholarship.setOnClickListener {
            startActivity(Intent(this, OffScholarshipActivity::class.java))
        }

        binding.stateScholarship.setOnClickListener {
            startActivity(Intent(this, StateScholarshipActivity::class.java))
        }


    }

}