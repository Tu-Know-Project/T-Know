package com.example.t_know.mapPage

import com.naver.maps.geometry.LatLng
data class MarkerInfo(
    val category: Category,
    val position: LatLng,
    val caption: String,
    val placeInfo: PlaceInfo
)

enum class Category {
    RESTAURANT,
    DESSERT,
    BAR,
    PARTNERSHIP,
    FACILITY,
    OFFICE,
    SMOKE_AREA,
    OTHER
}

val RestaurantMarkerList = listOf(
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.346330898623854, 126.73402886674774),
        caption = "24시 수육국밥",
        placeInfo = RestaurantList[0]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.343448506825936, 126.73543278120235),
        caption = "참나무누룽닭",
        placeInfo = RestaurantList[1]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.344896792181416, 126.73740268499398),
        caption = "형제들 감자탕",
        placeInfo = RestaurantList[2]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.608990485010956, 127.0703518565252),
        caption = "커리파라다이스",
        placeInfo = RestaurantList[3]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.346330898623854, 126.73402886674774),
        caption = "돈통마늘보쌈",
        placeInfo = RestaurantList[4]
    )
)

val DessertMarkerList = listOf(
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3444902, 126.738236),
        caption = "제이베이글",
        placeInfo = DessertList[0]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3463979, 126.7333562),
        caption = "쿠키슴슴",
        placeInfo = DessertList[1]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3440949, 126.7362865),
        caption = "타르트봉봉",
        placeInfo = DessertList[2]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.345879, 126.7368994),
        caption = "홍미당",
        placeInfo = DessertList[3]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3443774, 126.737301),
        caption = "302카페",
        placeInfo = DessertList[4]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3447228, 126.7352268),
        caption = "읍천리 382",
        placeInfo = DessertList[5]
    )
)

val BarMarkerList = listOf(
    MarkerInfo(
        category = Category.BAR,
        position = LatLng(37.3440773, 126.7356254),
        caption = "49 라운지",
        placeInfo = BarList[0]
    ),
    MarkerInfo(
        category = Category.BAR,
        position = LatLng(37.3436998, 126.7358311),
        caption = "트랩",
        placeInfo = BarList[1]
    ),
    MarkerInfo(
        category = Category.BAR,
        position = LatLng(37.3440773, 126.7356254),
        caption = "27%",
        placeInfo = BarList[2]
    ),
    MarkerInfo(
        category = Category.BAR,
        position = LatLng(37.34408621214149, 126.73553493486591),
        caption = "봉구비어",
        placeInfo = BarList[3]
    ),
    MarkerInfo(
        category = Category.BAR,
        position = LatLng(37.3477216, 126.7459678),
        caption = "찌그러진주전자에얼음막걸리",
        placeInfo = BarList[4]
    )
)

val PartnerMarkerList = listOf(
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.346330898623854, 126.73402886674774),
        caption = "로산진",
        placeInfo = PartnerList[0]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3449572, 126.738475),
        caption = "마라힐링",
        placeInfo = PartnerList[1]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34532229780389, 126.73628674114342),
        caption = "신오돌불닭발",
        placeInfo = PartnerList[2]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34491747832556, 126.73758882587924),
        caption = "샤브린",
        placeInfo = PartnerList[3]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34358888382552, 126.73575392354148),
        caption = "신마포갈매기",
        placeInfo = PartnerList[4]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34549486932076, 126.73589395893899),
        caption = "짬뽕관",
        placeInfo = PartnerList[5]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34555122716821, 126.73591351157113),
        caption = "육장인",
        placeInfo = PartnerList[6]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.344023878531736, 126.73789100110554),
        caption = "족발야시장",
        placeInfo = PartnerList[7]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34280461205991, 126.7365946062375),
        caption = "명륜진사갈비",
        placeInfo = PartnerList[8]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34431464999598, 126.73696175467684),
        caption = "패밀리양꼬치앤패밀리생고기",
        placeInfo = PartnerList[9]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3433649, 126.7347514),
        caption = "현대옥",
        placeInfo = PartnerList[10]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3443785, 126.7358769),
        caption = "퀸즈포차",
        placeInfo = PartnerList[11]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3436998, 126.7358311),
        caption = "트랩",
        placeInfo = PartnerList[12]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3438564, 126.735983),
        caption = "포차천국",
        placeInfo = PartnerList[13]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3457292, 126.7356338),
        caption = "한신포차",
        placeInfo = PartnerList[14]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3439846, 126.7361072),
        caption = "무적 회 포차",
        placeInfo = PartnerList[15]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3444043, 126.7365872),
        caption = "보보스 PC",
        placeInfo = PartnerList[16]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.344143, 126.7370526),
        caption = "레이지 그라운드",
        placeInfo = PartnerList[17]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3447228, 126.7352268),
        caption = "읍천리 382",
        placeInfo = PartnerList[18]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.345879, 126.7368994),
        caption = "CGV 정왕",
        placeInfo = PartnerList[19]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3440629, 126.7378242),
        caption = "킹스맨 보드카페",
        placeInfo = PartnerList[20]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3430658, 126.7368578),
        caption = "마리오짐",
        placeInfo = PartnerList[21]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3446671, 126.7373465),
        caption = "프렌드짐",
        placeInfo = PartnerList[22]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3466247, 126.7393923),
        caption = "HM풋살리그",
        placeInfo = PartnerList[23]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3466247, 126.7393923),
        caption = "카페더피치",
        placeInfo = PartnerList[24]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3446671, 126.7373465),
        caption = "휘턴기구필라테스",
        placeInfo = PartnerList[25]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.345211, 126.7359536),
        caption = "디저트 39",
        placeInfo = PartnerList[26]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3433649, 126.7347514),
        caption = "더존볼링장",
        placeInfo = PartnerList[27]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3444043, 126.7365872),
        caption = "리안헤어",
        placeInfo = PartnerList[28]
    ),
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.3449193, 126.7364419),
        caption = "코코코인노래연습장",
        placeInfo = PartnerList[29]
    )
)
val FacilityMarkerList = listOf(
    MarkerInfo(
        category = Category.PARTNERSHIP,
        position = LatLng(37.34168681424398, 126.73234683106969),
        caption = "Tip(기술혁신파크)",
        placeInfo = FacilityList[0]
    ),

    )