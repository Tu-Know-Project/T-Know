package com.example.t_know.mapPage

import BaseActivity
import android.os.Bundle
import com.example.t_know.BuildConfig
import com.example.t_know.databinding.ActivityMapBinding
import com.naver.maps.map.NaverMapSdk

class MapActivity :  BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val API_KEY = BuildConfig.CLIENT_KEY

        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformClient(API_KEY)
    }
}