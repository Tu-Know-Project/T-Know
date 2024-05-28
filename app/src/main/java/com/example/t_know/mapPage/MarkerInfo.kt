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
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3437981, 126.737562),
        caption = "평양왕족발순대",
        placeInfo = RestaurantList[5]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.344020, 126.7372516),
        caption = "두전콩밭",
        placeInfo = RestaurantList[6]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3447228, 126.7352268),
        caption = "고가네맛집",
        placeInfo = RestaurantList[7]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3449572, 126.738475),
        caption = "메차쿠타 돈까스",
        placeInfo = RestaurantList[8]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3448728, 126.7375478),
        caption = "샤브린",
        placeInfo = RestaurantList[9]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3433511, 126.7371343),
        caption = "월미당",
        placeInfo = RestaurantList[10]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3455661, 126.7324764),
        caption = "전라도연탄구이",
        placeInfo = RestaurantList[11]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.34590550000001, 126.7316332),
        caption = "정정아식당",
        placeInfo = RestaurantList[12]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.3435717, 126.735707),
        caption = "한가네 숯불닭갈비",
        placeInfo = RestaurantList[13]
    ),
    MarkerInfo(
        category = Category.RESTAURANT,
        position = LatLng(37.344264, 126.7348211),
        caption = "즉석기계우동 옛날짜장",
        placeInfo = RestaurantList[14]
    ),
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
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3453268, 126.7362804),
        caption = "재리스토스트카페",
        placeInfo = DessertList[6]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.3470703, 126.7333626),
        caption = "하이샌드",
        placeInfo = DessertList[7]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.34320401867642, 126.73489194094553),
        caption = "츄러스캠퍼스",
        placeInfo = DessertList[8]
    ),
    MarkerInfo(
        category = Category.DESSERT,
        position = LatLng(37.348001274401064, 126.73357153098269),
        caption = "쁘숑베이커리",
        placeInfo = DessertList[9]
    ),
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
        category = Category.FACILITY,
        position = LatLng(37.34188727214375, 126.73233765576695),
        caption = "Tip GX룸",
        placeInfo = FacilityList[0]
    ),

    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.341880559169724, 126.73235742864972),
        caption = "Tip 노래방",
        placeInfo = FacilityList[1]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34188285639667, 126.73237716955559),
        caption = "Tip 헬스장",
        placeInfo = FacilityList[2]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34162767958585, 126.73209594661566),
        caption = "Tip 라운지",
        placeInfo = FacilityList[3]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34180563112166, 126.7320953144798),
        caption = "하나 라운지",
        placeInfo = FacilityList[4]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.341848550965665, 126.73214876657744),
        caption = "Tip 2층 라운지",
        placeInfo = FacilityList[5]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.341805484162755, 126.7320304253057),
        caption = "Tip 3층 라운지",
        placeInfo = FacilityList[6]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34107303463666, 126.73286530058431),
        caption = "제2기숙사 1층 라운지",
        placeInfo = FacilityList[7]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.341194487647876, 126.7327830536145),
        caption = "제2기숙사 2층 라운지",
        placeInfo = FacilityList[8]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34069517515805, 126.73411927381368),
        caption = "종합교육관 라운지 채움, 나눔",
        placeInfo = FacilityList[9]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.34040964565605, 126.73336136709445),
        caption = "B동 라운지 배움",
        placeInfo = FacilityList[10]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.339823564317484, 126.73417877080436),
        caption = "D동 라운지 다룸",
        placeInfo = FacilityList[11]
    ),
    MarkerInfo(
        category = Category.FACILITY,
        position = LatLng(37.33961377354453, 126.73504844265928),
        caption = "E동 라운지 이룸",
        placeInfo = FacilityList[11]
    ),

    )

val OfficeMarkerList = listOf(
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.33969020867472, 126.73498046505951),
        caption = "컴퓨터공학부 학과사무실",
        placeInfo = OfficeList[0]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.33969020867472, 126.73498046505951),
        caption = "게임공학과 학과사무실",
        placeInfo = OfficeList[1]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.33941656524725, 126.73550334894024),
        caption = "나노반도체공학과 학과사무실",
        placeInfo = OfficeList[2]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.340158265382804, 126.73476722816471),
        caption = "경영학부 학과사무실",
        placeInfo = OfficeList[3]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.3396837349094, 126.73410309090019),
        caption = "신소재공학과 학과사무실",
        placeInfo = OfficeList[4]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.3396837349094, 126.73410309090019),
        caption = "생명화학공학과 학과사무실",
        placeInfo = OfficeList[5]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.340016935065954, 126.73402292194024),
        caption = "에너지전기공학과 학과사무실",
        placeInfo = OfficeList[6]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.3403171129712, 126.73328269963326),
        caption = "기계설계공학과 학과사무실",
        placeInfo = OfficeList[7]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.3403171129712, 126.73328269963326),
        caption = "메카트로닉스공학과 학과사무실",
        placeInfo = OfficeList[8]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.340383658286136, 126.73282542374629),
        caption = "디자인공학부 학과사무실",
        placeInfo = OfficeList[9]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.340383658286136, 126.73282542374629),
        caption = "기계공학과 학과사무실",
        placeInfo = OfficeList[10]
    ),
    MarkerInfo(
        category = Category.OFFICE,
        position = LatLng(37.338630389369875, 126.73448484139739),
        caption = "전자공학부 학과사무실",
        placeInfo = OfficeList[10]
    ),
    )

val SmokeMarkerList = listOf(
    MarkerInfo(
        category = Category.SMOKE_AREA,
        position = LatLng(37.34182048020668, 126.73268491170046),
        caption = "Tip 기숙사 뒷편",
        placeInfo = SmokeAreaList[0]
    ),
    MarkerInfo(
        category = Category.SMOKE_AREA,
        position = LatLng(37.34045537452338, 126.7346646186541),
        caption = "공학관 G동 뒷편",
        placeInfo = SmokeAreaList[1]
    ),
    MarkerInfo(
        category = Category.SMOKE_AREA,
        position = LatLng(37.34045537452338, 126.7346646186541),
        caption = "행정동 옆",
        placeInfo = SmokeAreaList[2]
    ),
    MarkerInfo(
        category = Category.SMOKE_AREA,
        position = LatLng(37.338546886616136, 126.73441460610988),
        caption = "산학융합관 옆",
        placeInfo = SmokeAreaList[3]
    ),
)