package com.example.t_know.mapPage

import BaseActivity
import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
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
    private var intentCode: Int = 0
    private var categoryCode: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val API_KEY = BuildConfig.CLIENT_KEY

        locationSource = FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as MapFragment?
            ?: MapFragment.newInstance().also {
                supportFragmentManager.beginTransaction().replace(R.id.map_fragment, it).commit()
            }

        NaverMapSdk.getInstance(this).client = NaverMapSdk.NaverCloudPlatformClient(API_KEY)
        mapFragment.getMapAsync(this)

        locationPermissionRequest.launch(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        )

        intentCode = intent.getIntExtra("intent_code", 0)
        categoryCode = intent.getIntExtra("category_code", 0)

        when(intentCode){
            10->selectCategoryEat()
            20->selectCategoryWhere()
            30->selectCategoryScool()
        }

        persistentBottomSheetEvent()

        callPlace()
    }
    private fun handleIntentData() {
        when (intentCode) {
            10 -> {
                binding.categoryOne.setImageResource(R.drawable.category_restaurant_icon)
                binding.categoryTwo.setImageResource(R.drawable.category_dessert_icon)
                binding.categoryThree.setImageResource(R.drawable.category_bar_icon)
                binding.categoryFour.setImageResource(R.drawable.category_partership_icon)
            }
            20 -> {
                binding.categoryOne.setImageResource(R.drawable.category_amenities_icon)
                binding.categoryTwo.setImageResource(R.drawable.category_office_icon)
                binding.categoryThree.setImageResource(R.drawable.category_smoke_area_icon)
                binding.categoryFour.setImageResource(R.drawable.category_other_icon)
            }
            30 -> {
                binding.categoryOne.visibility = View.GONE
                binding.categoryTwo.setImageResource(R.drawable.category_inrestaurant_icon)
                binding.categoryThree.setImageResource(R.drawable.category_incafe_icon)
                binding.categoryFour.visibility = View.GONE
            }

        }

        when (categoryCode) {
            21 -> showMarkers(FacilityMarkerList)
            22 -> showMarkers(OfficeMarkerList)
            23 -> showMarkers(SmokeMarkerList)
            24 -> showMarkers(OtherMarkerList)
        }
        when (categoryCode) {
            31 -> showMarkers(InRestaurantMarkerList)
            32 -> showMarkers(InCafeMarkerList)
        }
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

        behavior.state = BottomSheetBehavior.STATE_HIDDEN

        naverMap.setOnMapClickListener { pointF, latLng ->
            //Log.d("jes","mapclick")
            behavior.state = BottomSheetBehavior.STATE_HIDDEN

        }
        handleIntentData()
    }

    private val locationPermissionRequest = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        when {
            permissions.getOrDefault(Manifest.permission.ACCESS_FINE_LOCATION, false) -> {
            }

            permissions.getOrDefault(Manifest.permission.ACCESS_COARSE_LOCATION, false) -> {
            }

            else -> {
                showToastMessage("위치 권한을 허용해 주세요.")
                finish()
            }
        }
    }

    private fun clearMarkers() {
        markers.forEach { it.map = null }
        markers.clear()
    }

    private fun selectCategoryEat() {
        binding.categoryGroup.bringToFront()

        binding.categoryOne.setOnClickListener {
            showMarkers(RestaurantMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryTwo.setOnClickListener {
            showMarkers(DessertMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryThree.setOnClickListener {
            showMarkers(BarMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryFour.setOnClickListener {
            showMarkers(PartnerMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
    }
    private fun selectCategoryWhere() {
        binding.categoryGroup.bringToFront()

        binding.categoryOne.setOnClickListener {
            showMarkers(FacilityMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryTwo.setOnClickListener {
            showMarkers(OfficeMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryThree.setOnClickListener {
            showMarkers(SmokeMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryFour.setOnClickListener {
            showMarkers(OtherMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
    }
    private fun selectCategoryScool() {
        binding.categoryGroup.bringToFront()

        binding.categoryTwo.setOnClickListener {
            showMarkers(InRestaurantMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
        }
        binding.categoryThree.setOnClickListener {
            showMarkers(InCafeMarkerList)
            behavior.state = BottomSheetBehavior.STATE_HIDDEN
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
                marker.icon = when (info.category) {
                    Category.RESTAURANT -> OverlayImage.fromResource(R.drawable.marker_restaurant_icon)
                    Category.DESSERT -> OverlayImage.fromResource(R.drawable.marker_dessert_icon)
                    Category.BAR -> OverlayImage.fromResource(R.drawable.markers_bar_icon)
                    Category.PARTNERSHIP -> OverlayImage.fromResource(R.drawable.markers_partnership_icon)
                    Category.FACILITY ->OverlayImage.fromResource(R.drawable.markers_facility_icon)
                    Category.OFFICE ->OverlayImage.fromResource(R.drawable.markers_office_icon)
                    Category.SMOKE_AREA ->OverlayImage.fromResource(R.drawable.markers_smoking_area_icon)
                    Category.OTHER ->OverlayImage.fromResource(R.drawable.markers_other_icon)
                    Category.INCAFE ->OverlayImage.fromResource(R.drawable.marker_in_cafe_icon)
                    Category.INRESTAURANT ->OverlayImage.fromResource(R.drawable.marker_inrestaurant_icon)
                }
                marker.tag = info
                marker.setOnClickListener {
                    val markerInfo = it.tag as MarkerInfo
                    setPlaceInfo(markerInfo.placeInfo)
                    naverMap.moveCamera(
                        CameraUpdate.scrollTo(marker.position).animate(CameraAnimation.Fly)
                    )
                    behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    true
                }
                markers.add(marker)
            }
            naverMap.moveCamera(
                CameraUpdate.scrollTo(firstMarkerPosition).animate(CameraAnimation.Fly)
            )
        }
    }

    private fun setPlaceInfo(placeInfo: PlaceInfo) {
        binding.placeName.text = placeInfo.name
        binding.placeSummary.text = placeInfo.summary
        binding.placeLocation.text = placeInfo.address
        binding.placeCall.text = placeInfo.phoneNumber
        binding.placeCategory.text = placeInfo.category
        binding.placeRecommend.text = placeInfo.recommendedMenu
        Glide.with(this).load(placeInfo.photos).into(binding.placeImage)
    }

    private fun callPlace(){
        binding.callBtn.setOnClickListener {
            val phoneNum = binding.placeCall.text.toString()
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNum")))
        }
    }

}
