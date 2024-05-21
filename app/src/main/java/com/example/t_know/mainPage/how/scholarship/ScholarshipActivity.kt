package com.example.t_know.mainPage.what.integrated

import BaseActivity
import android.content.Intent
import android.os.Bundle
import com.example.t_know.databinding.ActivityHowScholarshipMainBinding
import com.example.t_know.databinding.ActivityWhatIntegratedInformationMainBinding
import com.example.t_know.mainPage.what.integrated.academic.AcademicActivity
import com.example.t_know.mainPage.what.integrated.subsidiary.SubsidiaryActivity

class ScholarshipActivity : BaseActivity<ActivityHowScholarshipMainBinding>(ActivityHowScholarshipMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.onScholarship.setOnClickListener{
            startActivity(Intent(this, AcademicActivity::class.java))
        }

        binding.offScholarship.setOnClickListener {
            startActivity(Intent(this, SubsidiaryActivity::class.java))
        }

        binding.stateScholarship.setOnClickListener {
            startActivity(Intent(this, SubsidiaryActivity::class.java))
        }


    }

}