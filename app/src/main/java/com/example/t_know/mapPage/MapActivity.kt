package com.example.t_know.mapPage

import BaseActivity
import android.Manifest
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.t_know.BuildConfig
import com.example.t_know.R
import com.example.t_know.databinding.ActivityMapBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.naver.maps.map.CameraAnimation
import com.naver.maps.map.CameraUpdate
import com.naver.maps.map.LocationTrackingMode
import com.naver.maps.map.MapFragment
import com.naver.maps.map.NaverMap
import com.naver.maps.map.NaverMapSdk
import com.naver.maps.map.OnMapReadyCallback
import com.naver.maps.map.overlay.Marker
import com.naver.maps.map.overlay.OverlayImage
import com.naver.maps.map.util.FusedLocationSource

class MapActivity : BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate),
    OnMapReadyCallback {
    lateinit var behavior: BottomSheetBehavior<LinearLayout>

    private val LOCATION_PERMISSION_REQUEST_CODE: Int = 1000
    private lateinit var locationSource: FusedLocationSource
    private lateinit var naverMap: NaverMap
    private var markers = mutableListOf<Marker>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val API_KEY = BuildConfig.CLIENT_KEY

        // Initialize locationSource
        locationSource = FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                supportFragmentManager.beginTransaction().replace(R.id.map_fragment, it).commit()
            }

        NaverMapSdk.getInstance(this).client = NaverMapSdk.NaverCloudPlatformClient(API_KEY)
        mapFragment.getMapAsync(this)

        locationPermissionRequest.launch(
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
        )

        selectCategory()
        persistentBottomSheetEvent()
    }

    private fun persistentBottomSheetEvent() {
        behavior = BottomSheetBehavior.from(binding.bottomSheet)
        // Initialize the BottomSheet in collapsed state
        behavior.state = BottomSheetBehavior.STATE_COLLAPSED
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

        behavior.state = BottomSheetBehavior.STATE_HIDDEN
        naverMap.setOnMapClickListener { _, _ ->
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }

    }

    private val locationPermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
                // Fine location access granted
            }
            permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
                // Coarse location access granted
            } else -> {
            // No location access granted
            showToastMessage("위치 권한을 허용해 주세요.")
            finish()
        }
        }
    }

    private fun clearMarkers() {
        markers.forEach { it.map = null }
        markers.clear()
    }

    private fun selectCategory() {
        binding.categoryGroup.bringToFront()

        binding.categoryRestaurant.setOnClickListener {
            showMarkers(RestaurantMarkerList)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        binding.categoryDessert.setOnClickListener {
            showMarkers(DessertMarkerList)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        binding.categoryBar.setOnClickListener {
            showMarkers(BarMarkerList)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        binding.categoryPartnership.setOnClickListener {
            showMarkers(PartnerMarkerList)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
    }

    private fun showMarkers(markerList: List<MarkerInfo>) {
        clearMarkers()
        if (markerList.isNotEmpty()) {
            val firstMarkerPosition = markerList[0].position

            markerList.forEach { info ->
                val marker = Marker()
                marker.position = info.position
                marker.captionText = info.caption
                marker.map = naverMap
                marker.icon = when(info.category) {
                    Category.RESTAURANT -> OverlayImage.fromResource(R.drawable.marker_restaurant_icon)
                    Category.DESSERT -> OverlayImage.fromResource(R.drawable.marker_dessert_icon)
                    Category.BAR -> OverlayImage.fromResource(R.drawable.markers_bar_icon)
                    Category.PARTNERSHIP -> OverlayImage.fromResource(R.drawable.markers_partnership_icon)
                }
                marker.tag = info  // MarkerInfo를 태그로 설정
                marker.setOnClickListener {
                    val markerInfo = it.tag as MarkerInfo
                    setPlaceInfo(markerInfo.placeInfo)
                    behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    naverMap.moveCamera(CameraUpdate.scrollTo(marker.position).animate(CameraAnimation.Fly))
                    true
                }
                markers.add(marker)
            }
            naverMap.moveCamera(CameraUpdate.scrollTo(firstMarkerPosition).animate(CameraAnimation.Fly))
        }
    }

    private fun setPlaceInfo(placeInfo: PlaceInfo) {
        binding.placeName.text = placeInfo.name
        binding.placeSummary.text = placeInfo.summary
        binding.placeLocation.text = placeInfo.address
        binding.placeCall.text = placeInfo.phoneNumber
        binding.placeCategory.text = placeInfo.category.toString()
        binding.placeRecommend.text = placeInfo.recommendedMenu
        Glide.with(this).load(placeInfo.photos).into(binding.placeImage)
    }

}
