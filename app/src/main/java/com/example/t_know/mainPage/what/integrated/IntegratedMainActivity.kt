package com.example.t_know.mainPage.what.integrated

import BaseActivity
import android.content.Intent
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatIntegratedInformationMainBinding
import com.example.t_know.mainPage.what.integrated.academic.AcademicActivity
import com.example.t_know.mainPage.what.integrated.subsidiary.SubsidiaryActivity

class IntegratedMainActivity : BaseActivity<ActivityWhatIntegratedInformationMainBinding>(ActivityWhatIntegratedInformationMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.academicAdministration.setOnClickListener{
            startActivity(Intent(this, AcademicActivity::class.java))
        }

        binding.subsidiaryAdministration.setOnClickListener {
            startActivity(Intent(this, SubsidiaryActivity::class.java))
        }


    }

}