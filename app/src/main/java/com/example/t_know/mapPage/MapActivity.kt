package com.example.t_know.mapPage

import BaseActivity
import android.Manifest
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.t_know.BuildConfig
import com.example.t_know.R
import com.example.t_know.databinding.ActivityMapBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.naver.maps.map.LocationTrackingMode
import com.naver.maps.map.MapFragment
import com.naver.maps.map.MapView
import com.naver.maps.map.NaverMap
import com.naver.maps.map.NaverMapSdk
import com.naver.maps.map.OnMapReadyCallback
import com.naver.maps.map.overlay.Marker
import com.naver.maps.map.overlay.OverlayImage
import com.naver.maps.map.util.FusedLocationSource

class MapActivity : BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate),
    OnMapReadyCallback {
    lateinit var behavior: BottomSheetBehavior<LinearLayout>

    private lateinit var mapView: MapView
    private val LOCATION_PERMISSTION_REQUEST_CODE: Int = 1000
    private lateinit var locationSource: FusedLocationSource
    private lateinit var naverMap: NaverMap
    private var markers = mutableListOf<Marker>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val API_KEY = BuildConfig.CLIENT_KEY

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                supportFragmentManager.beginTransaction().replace(R.id.map_fragment, it).commit()
            }

        NaverMapSdk.getInstance(this).client = NaverMapSdk.NaverCloudPlatformClient(API_KEY)
        mapFragment.getMapAsync(this)
        locationPermissionRequest
        locationSource = FusedLocationSource(this, LOCATION_PERMISSTION_REQUEST_CODE)

        binding.categoryGroup.bringToFront()

        binding.categoryRestaurant.setOnClickListener{
            showMarkers(RestaurantMarkerList)
        }
        binding.categoryDessert.setOnClickListener{
            showMarkers(DessertMarkerList)
        }
        binding.categoryBar.setOnClickListener{
            showMarkers(BarMarkerList)
        }
        binding.categoryPartnership.setOnClickListener{
            showMarkers(PartnerMarkerList)
        }
        persistentBottomSheetEvent()
    }

    private fun persistentBottomSheetEvent() {
        behavior = BottomSheetBehavior.from(binding.bottomSheet)
        behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {}

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> {}
                    BottomSheetBehavior.STATE_DRAGGING -> {}
                    BottomSheetBehavior.STATE_EXPANDED -> {}
                    BottomSheetBehavior.STATE_HIDDEN -> {}
                    BottomSheetBehavior.STATE_SETTLING -> {}
                }
            }
        })

    }

    override fun onMapReady(naverMap: NaverMap) {
        this.naverMap = naverMap
        naverMap.locationSource = locationSource
        naverMap.locationTrackingMode = LocationTrackingMode.Follow
    }


    private val locationPermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
            }
            permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
            } else -> {

            showToastMessage("위치 권한을 허용해 주세요.")
            finish()
        }
        }
    }

    // 눌러졌을 때 이미지 달라지게 - 무슨 탭이 눌러졌는지
    private fun showMarkers(markerList: List<MarkerInfo>) {
        clearMarkers()
        markerList.forEach { info ->
            val marker = Marker()
            marker.position = info.position
            marker.captionText = info.caption
            marker.map = naverMap
            marker.icon = when(info.category){

                Category.RESTAURANT -> OverlayImage.fromResource(R.drawable.marker_restaurant_icon)
                Category.DESSERT -> OverlayImage.fromResource(R.drawable.marker_dessert_icon)
                Category.BAR -> OverlayImage.fromResource(R.drawable.markers_bar_icon)
                Category.PARTNERSHIP -> OverlayImage.fromResource(R.drawable.markers_partnership_icon)

            }
            markers.add(marker)
        }
    }

    private fun clearMarkers(){
        markers.forEach{ it.map = null }
        markers = mutableListOf(Marker())
    }
}
