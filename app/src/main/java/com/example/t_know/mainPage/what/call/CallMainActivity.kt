package com.example.t_know.mainPage.what.call

import BaseActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.example.t_know.databinding.ActivityWhatCallBinding

class CallMainActivity : BaseActivity<ActivityWhatCallBinding>(
    ActivityWhatCallBinding::inflate
){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        callClick()
    }

    private fun callClick(){
        binding.carrerCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0122")))
        }
        binding.domitoryCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031:8041-0082")))
        }
        binding.facilityCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0162")))
        }
        binding.libCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0772")))
        }
        binding.practiceCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0854")))
        }
        binding.schoolCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0022")))
        }
        binding.studentCall.setOnClickListener {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:031-8041-0092")))
        }
    }
}