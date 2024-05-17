package com.example.t_know.mainPage.what.integrated

import BaseActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.t_know.R
import com.example.t_know.databinding.ActivityMainBinding
import com.example.t_know.databinding.ActivityWhatIntegratedInformationMainBinding

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