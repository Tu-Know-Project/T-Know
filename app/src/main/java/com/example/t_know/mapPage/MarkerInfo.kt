package com.example.t_know.mapPage

import com.naver.maps.geometry.LatLng
data class MarkerInfo(
    val category: Category,
    val position: LatLng,
    val caption: String
)

enum class Category {
    RESTAURANT,
    DESSERT,
    BAR,
    PARTNERSHIP
}

val RestaurantMarkerList = listOf(
    MarkerInfo(Category.RESTAURANT,LatLng(37.62444907132257, 127.09321109051345), "화랑대 철도공원"),
    MarkerInfo(Category.RESTAURANT,LatLng(37.608990485010956, 127.0703518565252), "중랑천 산책로")
    // 더 많은 맛집 마커들 추가
)

val DessertMarkerList = listOf(
    MarkerInfo(Category.DESSERT,LatLng(37.52444907132257, 127.09321109051345), "카페1"),
    MarkerInfo(Category.DESSERT,LatLng(37.508990485010956, 127.0703518565252), "카페2")
    // 더 많은 카페 마커들 추가
)

val BarMarkerList = listOf(
    MarkerInfo(Category.BAR,LatLng(37.42444907132257, 127.09321109051345), "술집1"),
    MarkerInfo(Category.BAR,LatLng(37.408990485010956, 127.0703518565252), "술집2")
    // 더 많은 술집 마커들 추가
)
val PartnerMarkerList = listOf(
    MarkerInfo(Category.PARTNERSHIP,LatLng(37.32444907132257, 127.09321109051345), "제휴1"),
    MarkerInfo(Category.PARTNERSHIP,LatLng(37.308990485010956, 127.0703518565252), "제휴2")
    // 더 많은 제휴 마커들 추가
)