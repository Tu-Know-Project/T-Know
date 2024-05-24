package com.example.t_know.mainPage

import BaseActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.t_know.R
import com.example.t_know.databinding.ActivityMainBinding
import com.example.t_know.databinding.ActivityTobiNyangBinding

class TobiNyangActivity :BaseActivity<ActivityTobiNyangBinding>(ActivityTobiNyangBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}