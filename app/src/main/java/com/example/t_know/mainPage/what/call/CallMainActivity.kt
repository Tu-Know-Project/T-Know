package com.example.t_know.mainPage.what.call

import BaseActivity
import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.t_know.databinding.ActivityWhatCallBinding

class CallMainActivity : BaseActivity<ActivityWhatCallBinding>(
    ActivityWhatCallBinding::inflate
){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        callClick()
        phonePermissionRequest.launch(
            arrayOf(
                Manifest.permission.CALL_PHONE,
            )
        )
    }

    private val phonePermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions.getOrDefault(Manifest.permission.CALL_PHONE, false) -> {

            }

            else -> {
                showToastMessage("전화 권한을 허용해 주세요.")
                finish()
            }
        }
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