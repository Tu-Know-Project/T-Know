package com.example.t_know.mapPage

data class PlaceInfo(
    val name: String,
    val summary: String,
    val address: String,
    val phoneNumber: String,
    val category: String,
    val recommendedMenu: String,
    val photos: String
)

val RestaurantList = listOf(
    PlaceInfo(
        name = "24시 수육국밥",
        summary = "48블럭 수육국밥 맛집(개발자 강추!)",
        address = "시흥시 서촌상가 3길 7-13",
        phoneNumber = "031-319-8676",
        category = "국밥",
        recommendedMenu = "수육국밥, 순대국밥",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210801_38%2F1627801372012vT23R_JPEG%2FTAUosSn2OjMY1s3wOim65-T7.jpg"
    ),
    PlaceInfo(
        name = "참나무누룽닭",
        summary = "숯불에 구운 닭",
        address = "시흥시 중심상가 3길 31-1",
        phoneNumber = "0507-1484-5222",
        category = "구운 치킨, 숯불 구이 닭",
        recommendedMenu = "누룽지 통닭 + 콘치즈 폭포",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200626_123%2F1593144906043dywjE_JPEG%2FXSXDw3gCqwe4De1oqcOsKqR_.jpg"
    ),
    PlaceInfo(
        name = "형제들 감자탕",
        summary = "49블럭 감자탕 맛집",
        address = "시흥시 중심상가 2길 22",
        phoneNumber = "031-496-0833",
        category = "감자탕",
        recommendedMenu = "뼈해장국, 감자탕",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzEyMDZfMTg2%2FMDAxNzAxNzkxNjY1Mzg2.sPNcZTyp2b7dnTTsLK2MSB62-PHS4OkELKmuO0EaDLog.7ihKJNmm1bCwnn_HjZashR7CqzDtN2sbvXt2KSc2E4Qg.JPEG.oo4114%2FIMG_2692.jpg"
    ),
    PlaceInfo(
        name = "커리파라다이스",
        summary = "현지 쉐프의 커리를 맛 볼 수 있는 곳",
        address = "시흥시 중심상가 2길 22 2층 201호",
        phoneNumber = "010-5965-6185",
        category = "커리, 인도 음식",
        recommendedMenu = "버터 난 + 마크니, 갈릭 난 + 빈달루",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAyMTdfMTUg%2FMDAxNzA4MTYyNDkyNjA2.1GeP412NKPcwtJW86KUCxYRWSaMv-w14JaAxDUlLZSYg.TvBFp1KaML2kpFGBuZg9ayXIOPqu5UUMTFFz5ObfqQwg.JPEG%2F20240217_173903.jpg.jpg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "돈통마늘보쌈",
        summary = "보쌈 정식 맛집",
        address = "시흥시 중심상가로 181 삼화빌딩 1층",
        phoneNumber = "031-497-5382",
        category = "보쌈, 한정식",
        recommendedMenu = "마늘 보쌈 정식",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200209_231%2F1581203197602lRb3b_JPEG%2FmwDieihx-FO8R_bZiYA1-ZEt.jpg"
    ),
    PlaceInfo(
        name = "평양왕족발순대",
        summary = "직접 손질해서 삶는 국내산 족발과 직접 만든 순대를 넣은 순댓국 집",
        address = "경기 시흥시 중심상가4길 18 1층 106호",
        phoneNumber = "031-497-0337",
        category = "족발, 한정식",
        recommendedMenu = "평양왕족발, 순댓국",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA1MTRfOTkg%2FMDAxNzE1NjQ1OTYzMTUx.TpNzXqhc7smpdBeHXNZjSQA3ewWT-oCcQtWFMmBBd2gg.V7OtOcy9HIMJSjJ-UzpMiOJk31i6_BazpVgfKynRQEAg.JPEG%2F20240506_184059.jpg"
    ),
    PlaceInfo(
        name = "두전콩밭",
        summary = "국내산 콩을 사용한 건강한 식당",
        address = "경기 시흥시 중심상가로 199",
        phoneNumber = "0507-1342-3232",
        category = "두부요리, 한정식",
        recommendedMenu = "김치두부전골, 콩비지찌개",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220201_124%2F1643716547331QLAu1_JPEG%2F1643694386890.jpg"
    ),
    PlaceInfo(
        name = "고가네맛집",
        summary = "다양한 종류의 싱싱한 생선을 저렴하게 드실 수 있는 어머니 손맛 생선구이 맛집!",
        address = "경기도 시흥시 정왕동 1742-1",
        phoneNumber = "031-319-0415",
        category = "생선구이, 한정식",
        recommendedMenu = "생선구이정식, 갈치조림",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA1MjhfMTc3%2FMDAxNzE2ODY3NjcxNDU4.IA-N1iSQ_AyTyGfTJTQuCmzoF4tuHiAqi-lNIKtoUFYg.FgO7mGjIEhAkb79Quz8HR925L8FoqWf8g25ff8nAhBAg.JPEG%2FIMG_9343.jpg"
    ),
    PlaceInfo(
        name = "메차쿠차 돈까스",
        summary = "다양한 돈가스를 맛볼 수 있는 집",
        address = "경기 시흥시 정왕대로 230 제일프라자 111, 112",
        phoneNumber = "031-504-9000",
        category = "돈까스, 일식",
        recommendedMenu = "메차쿠차 돈가스, 고구마 치즈 돈가스, 김치나베",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231226_192%2F1703577949219k1nsT_JPEG%2FKakaoTalk_20231226_165701233.jpg"
    ),
    PlaceInfo(
        name = "샤브린",
        summary = "샤브샤브와 월남쌈을 한번에 즐길 수 있는 정왕동 샤브샤브",
        address = "경기 시흥시 중심상가2길 22 203호",
        phoneNumber = "0507-1447-9995",
        category = "샤브샤브, 일식",
        recommendedMenu = "소등심 샤브, 등심 쌀국수",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDAzMjhfMTky%2FMDAxNzExNjMxOTg0MDMx.gjmjetK3nB9SfsdNAbI9AWFjGPbq46Havkwqn-5LFOcg.d5Y0JL8FVpkwKIbyGc6-qFuybc5zVzUzULYN7j4Gw_8g.JPEG%2F20240328%25A3%25DF181301.jpg"
    ),
    PlaceInfo(
        name = "월미당",
        summary = "매일 직접 우려내는 신선하고 진한 육수가 일품인 베트남쌀국수 전문점",
        address = "경기 시흥시 중심상가4길 24-1 1층 월미당",
        phoneNumber = "0507-1345-6882",
        category = "쌀국수, 베트남 음식",
        recommendedMenu = "차돌 쌀국수, 분짜",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230217_53%2F1676611977559faw5y_JPEG%2FKakaoTalk_20230217_142917034_02.jpg"
    ),
    PlaceInfo(
        name = "전라도연탄구이",
        summary = "정왕동 맛집 전라도 맛있는 연탄구이",
        address = "경기 시흥시 서촌상가2길 29",
        phoneNumber = "031-432-9500",
        category = "돼지고기구이, 한정식",
        recommendedMenu = "생삼겹살, 김치찌개",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA1MDFfMjAw%2FMDAxNzE0NTY5MjU0NDY1.jwRq1ZaJiBjOtC5Htz7ERjkRE0stMqQgYpm-woi_zgAg.mIAc0OdswI_wONAnrmSI18u5fG0jPRqciVIoMvUFTG0g.JPEG%2FIMG_8738.jpg"
    ),
    PlaceInfo(
        name = "정정아식당",
        summary = "닭볶음탕과 꼬막무침이 맛있는 정왕동 맛집",
        address = "경기 시흥시 서촌상가4길 20 106호, 107호, 108호",
        phoneNumber = "0507-1374-9870",
        category = "닭볶음탕, 한정식",
        recommendedMenu = "닭볶음탕, 꼬막무침",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDAyMDVfMzMg%2FMDAxNzA3MTA0MjE4NTc2.iWMVHQKw26EkUJ1XhsT8cG-xHVo_ia_yQGULrD31PeUg.6bKhh0CzN7bfDlpax3JT9rYLec1seS63SYXTNlmdxZYg.JPEG.vdtpn%2F20240203_180048.jpg"
    ),
    PlaceInfo(
        name = "한가네 숯불닭갈비",
        summary = "전통 숯불닭갈비와 이탈리안 퓨전 토마토 스파게티 닭갈비를 맛볼 수 있는 맛집",
        address = "경기 시흥시 중심상가3길 31 한가네숯불닭갈비",
        phoneNumber = "0507-1378-4792",
        category = "닭갈비, 한정식",
        recommendedMenu = "숯불양념닭갈비, 쟁반막국수",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA0MjBfOTIg%2FMDAxNzEzNTk2MzE1Nzk3.4rjpgsuBUMFIO7M4igd6OJkkU_HeEfJcfWw-a6BNIYMg.QRxIBh6ic5PG-f789hfFvVlGYzUFNaEsDgBugSn3qwwg.JPEG%2FIMG_3217.JPG"
    ),
    PlaceInfo(
        name = "즉석기계우동 옛날짜장",
        summary = "즉석으로 면을 뽑으며 진하게 우려낸 육수로 만든 기계우동과 기름기 없이 달콤하고 고소한 옛날짜장을 맛볼 수 있는 맛집",
        address = "경기 시흥시 중심상가1길 3-6 101호 기계우동 옛날짜장",
        phoneNumber = "0507-1364-7417",
        category = "분식, 한정식",
        recommendedMenu = "비빔우동, 닭알김밥",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230430_256%2F1682821221633vvqYE_JPEG%2F16828211878736669093573157104869.jpg"
    )
)

val DessertList = listOf(
    PlaceInfo(
        name = "제이베이글",
        summary = "49블럭 베이글 맛집",
        address = "시흥시 중심상가4길 10 105, 106호",
        phoneNumber = "031-506-1472",
        category = "카페, 베이글",
        recommendedMenu = "폴렌타모닝 샌드위치, 대파치즈 베이글",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAzMjBfMTQg%2FMDAxNzEwODkwOTcxOTc5.NjoJSqNgm9xWWeO8HIy4DNqALLzSbZMbim3qA9Q9zSAg.Ccfoe-NiR_y3uQH2yeFHaI0TKGL0TrA92lDUcflsgcIg.JPEG%2F20240319_120027.jpg.jpg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "쿠키슴슴",
        summary = "48블럭 맛있는 디저트 집",
        address = "시흥시 중심상가로 155 104호1층",
        phoneNumber = "0507-1386-0954",
        category = "카페, 디저트",
        recommendedMenu = "초코칩쿠키, 말차 크루키",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231117_172%2F1700199099765Txmvp_JPEG%2F20231116_112616.jpg"
    ),
    PlaceInfo(
        name = "타르트봉봉",
        summary = "49블럭 타르트 가게",
        address = "시흥시 중심상가로 192 108호",
        phoneNumber = "0507-1386-3554",
        category = "디저트, 타르트",
        recommendedMenu = "에그타르트, 생딸기타르트",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzEyMjdfMjQg%2FMDAxNzAzNjc4NDIxNzc2.I0BV8r_mwFQVSVwoyU-2eoyjYF0sO48LoHUUNi2KVbAg.FGeIcr69HMBec-tm9jeENG76QCTv6LhIEVjvkUWHfvIg.PNG.dmsgp9702%2Fimage.png"
    ),
    PlaceInfo(
        name = "홍미당",
        summary = "성담스퀘어 맛있는 빵집",
        address = "시흥시 정왕대로 210 성담스퀘어 1층",
        phoneNumber = "0507-1446-3439",
        category = "베이커리",
        recommendedMenu = "소금빵, 오징어먹물빵",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA1MDVfMjYx%2FMDAxNzE0ODg3ODQ2MTI0.A9ECSDv9o4sQTrHsV48KiOqTDHjBN6b8xnIT_7Qww2sg.xYHege7y_QC_Z1mlNt3jzFUjU51e7voWPmIydz8nZUMg.JPEG%2Foutput_2719927753.jpg"
    ),
    PlaceInfo(
        name = "302카페",
        summary = "조용하고 아늑한 카페",
        address = "시흥시 중심상가2길 20-13 203호",
        phoneNumber = "031-433-1696",
        category = "카페, 디저트",
        recommendedMenu = "밀크티 라떼",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190807_38%2F1565173417923gqbYh_JPEG%2FgSwc_L8BYgpFLwKx8HxkeRF8.jpeg.jpg"
    ),
    PlaceInfo(
        name = "읍천리 382",
        summary = "샌드위치와 음료가 맛있는 읍천리",
        address = "시흥시 중심상가로 180 108호, 109호",
        phoneNumber = "0507-1350-1633",
        category = "카페, 샌드위치",
        recommendedMenu = "불고기 샌드위치, 자두 쥬스",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221102_236%2F1667380207048wMtwl_JPEG%2F1_%25B0%25A1%25B0%25D4_%25C0%25CC%25B9%25CC%25C1%25F6_%25281%2529.jpg"
    ),
    PlaceInfo(
        name = "재리스토스트카페",
        summary = "직접 연구하여 개발한 소스 조합으로 중독성 강한 토스트와 주문 즉시 튀겨낸 츄러스 맛집",
        address = "경기 시흥시 중심상가2길 12-6 2층 204호",
        phoneNumber = "010-9943-2571",
        category = "토스트, 카페",
        recommendedMenu = "하프토스트, 츄러스",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220616_26%2F1655310472611PdADD_PNG%2F05A2FA1B-2C88-45FC-AE46-24D56D57504A.png"
    ),
    PlaceInfo(
        name = "하이샌드",
        summary = "베이글 샌드위치와 파스타 샐러드 맛집",
        address = "경기 시흥시 서촌상가2길 12 103호",
        phoneNumber = "070-4151-3364",
        category = "샌드위치, 카페",
        recommendedMenu = "오믈렛 베이컨 베이글, 쉬림프 파스타 샐러드",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210801_100%2F1627780183891JHz17_JPEG%2Fimage.jpg"
    ),
    PlaceInfo(
        name = "츄러스캠퍼스",
        summary = "정왕동 49블록에 위치한 커피와 디저트가 맛있는 츄러스 캠퍼스",
        address = "경기 시흥시 중심상가1길 14 112호",
        phoneNumber = "0507-1384-1320",
        category = "츄러스, 카페",
        recommendedMenu = "오리지널 츄러스, 아츄",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA0MjZfMTY2%2FMDAxNzE0MDg0ODYwNDI4.vc6TVeI3Y6LICjRxcBtTK1e4scbDTDvRNoNdTww0X-Eg.qUzMY4JtCOYXYPBpUSXefAMS9qidY67kql7wW7GSJvYg.JPEG%2Foutput_3627945968.jpg"
    ),
    PlaceInfo(
        name = "쁘숑베이커리",
        summary = "건강한 방식으로 조리하는 천연발효빵 제작 빵집.",
        address = "경기 시흥시 정왕대로 174 114,115호 쁘숑베이커리",
        phoneNumber = "0507-1332-3580",
        category = "빵, 카페",
        recommendedMenu = "옥수수마약빵, 생크림크로와상, 엔젤쉬폰",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDAxMDNfMTc3%2FMDAxNzA0MjkyMTUyMTEz.0Sp07gFE_YMrRwS5_Ukuxa3DjoT9Tk7XnWp6ZIzjEn0g.gZAGHSm31HxL45RWKWpn_TX0P6G2oqsQ3H-u4Cy-iVgg.JPEG.yumreview%2FIMG_0568.JPG"
    ),
)

val BarList = listOf(
    PlaceInfo(
        name = "49 라운지",
        summary = "다트와 칵테일을 즐길 수 있는 바",
        address = "시흥시 중심상가3길 26 2층 204호",
        phoneNumber = "0507-1346-0673",
        category = "바(Bar)",
        recommendedMenu = "칵테일 무제한 19,000",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20180107_84%2F1515291261245dWY4D_JPEG%2FfI-6cuh2BEqA3bSOeoVnij8Y.jpg"
    ),
    PlaceInfo(
        name = "트랩",
        summary = "다양한 안주와 빙수가 맛있는 요리주점",
        address = "시흥시 중심상가3길 29 1층트랩",
        phoneNumber = "0507-1321-2068",
        category = "요리주점",
        recommendedMenu = "우삼겹 간장 숙주볶움",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240405_135%2F17122439439616Rr3w_JPEG%2FIMG_20240320_195216_064.jpg"
    ),
    PlaceInfo(
        name = "27%",
        summary = "첵스초코빙수가 맛있는 요리주점",
        address = "시흥시 중심상가3길 26 지하 102 103호",
        phoneNumber = "0507-1322-4833",
        category = "요리주점, 빙수",
        recommendedMenu = "첵스초코빙수",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20181216_45%2F1544901272213GT0MY_JPEG%2FlLaH7Apwh1iND4gq-vhmXzNW.jpg"
    ),
    PlaceInfo(
        name = "봉구비어",
        summary = "유쾌한 사장님과 맛있는 음식",
        address = "시흥시 중심상가3길 26 청송프라자",
        phoneNumber = "010-8367-7421",
        category = "맥주, 호프",
        recommendedMenu = "봉구 오뎅탕",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200201_157%2F1580560630173lb0l5_JPEG%2Fimage.jpg"
    ),
    PlaceInfo(
        name = "찌그러진주전자에얼음막걸리",
        summary = "맛있는 안주와 막걸리집",
        address = "시흥시 봉우재로 57",
        phoneNumber = "0507-1311-6102",
        category = "전통, 민속주점",
        recommendedMenu = "얼음막걸리",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzAzMDdfMjcy%2FMDAxNjc4MTg4NTYxOTE1.HIrN_Q71FIs_TjKhrh_YnFOQhX0-rf0_dHHtnWULBzIg.AS4Fb3eoF1VGcKOyYi3nF_AGZvz5y2APh-7XneuMJ3cg.JPEG%2F15DE6939-8519-44CA-84EF-BCE601DF72DB.jpeg%3Ftype%3Dw1500_60_sharpen"
    ),
)

val PartnerList = listOf(
    PlaceInfo(
        name = "로산진",
        summary = "일본 현지 감성으로 가득한 일식집",
        address = "시흥시 중심상가 1길 14",
        phoneNumber = "031-431-9199",
        category = "돈카츠, 라멘, 덮밥",
        recommendedMenu = "돈코츠 라멘, 사케동",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230705_85%2F1688547321015VRjoQ_JPEG%2F20230630_214546.jpg"
    ),
    PlaceInfo(
        name = "마라힐링",
        summary = "49 마라탕 맛집",
        address = "시흥시 정왕대로 230",
        phoneNumber = "031-497-3466",
        category = "마라탕, 마라샹궈",
        recommendedMenu = "마라탕, 마라샹궈, 꿔바로우",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA2MjhfMjMz%2FMDAxNjg3OTIzNjUzMjQ2.ydLdP--CH0idcT4iocTNiNaEbjN8tawYan8Lvd6BsMEg.SEcC9np4mXF03BagTXcU2dAZypyWjbJmDTL-8s3sm0sg.JPEG.dagaam%2F20230628%25A3%25DF115226.jpg"
    ),
    PlaceInfo(
        name = "신오돌불닭발",
        summary = "49 원탑 닭발집",
        address = "시흥시 중심상가2길 12-6 106호",
        phoneNumber = "031-488-9288",
        category = "닭발",
        recommendedMenu = "불닭발, 오돌뼈, 계란찜",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230405_276%2F1680674724058VSQC3_JPEG%2F1680674686242.jpg"
    ),
    PlaceInfo(
        name = "샤브린",
        summary = "월남쌈을 한번에 즐길수 있는곳",
        address = "시흥시 중심상가2길 22 203호",
        phoneNumber = "0507-1447-9995",
        category = "샤브샤브, 월남쌈",
        recommendedMenu = "소고기 샤브샤브",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230313_22%2F1678675169671L0sla_JPEG%2F20230313_113855.jpg"
    ),
    PlaceInfo(
        name = "신마포갈매기",
        summary = "가성비 돼지구이 무한리필집",
        address = "시흥시 중심상가3길 31 금영프라자",
        phoneNumber = "0507-1359-2341",
        category = "돼지고기구이",
        recommendedMenu = "숯불갈매기살, 돼지갈비",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240309_205%2F17099427617552ka30_JPEG%2FKakaoTalk_20240308_185343829_04.jpg"
    ),
    PlaceInfo(
        name = "짬뽕관",
        summary = "다양한 짬뽕 요리를 제공하는 중식당",
        address = "시흥시 중심상가2길 4-3 1층",
        phoneNumber = "0507-1428-1634",
        category = "중식당",
        recommendedMenu = "순두부짬뽕, 차돌짬뽕",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240119_281%2F1705626833320I8aW7_JPEG%2F2.jpg"
    ),
    PlaceInfo(
        name = "육장인",
        summary = "숯불구이 한돈집",
        address = "시흥시 중심상가2길 4-3 1층 103호",
        phoneNumber = "0507-1318-0430",
        category = "육류, 고기요리",
        recommendedMenu = "삼겹살, 뒷고기, 껍데기",
        photos = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzEwMzFfMjY3%2FMDAxNjk4NzMwNjkxMzMy._SnGE4fmaT3DpixPvEeK4x9RF-imefS8oS6f4zKOzU8g.6T3dwwSV7tcnlu6FTHYwnEvhW_b55G6E6VItMCKwKbQg.PNG.gtec0111%2FKakaoTalk_20231031_143659765.png"
    ),
    PlaceInfo(
        name = "족발야시장",
        summary = "다양한 족발 요리를 즐길 수 있는 곳",
        address = "시흥시 중심상가4길 16",
        phoneNumber = "031-432-4909",
        category = "족발, 보쌈",
        recommendedMenu = "실속보쌈, 실속불족발",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220802_185%2F1659427541370yFLWy_JPEG%2F%25B3%25D7%25C7%25C3%25B8%25B6%25C5%25A91-%25BC%25F6%25C1%25A4%25BF%25EB.jpg"
    ),
    PlaceInfo(
        name = "명륜진사갈비",
        summary = "49 명륜진사갈비",
        address = "시흥시 중심상가4길 32 1층",
        phoneNumber = "031-431-8886",
        category = "갈비, 돼지갈비",
        recommendedMenu = "돼지갈비 무한리필 : 19,900",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231025_188%2F1698206758267a2t7q_JPEG%2F2.jpg"
    ),
    PlaceInfo(
        name = "패밀리양꼬치앤패밀리생고기",
        summary = "양꼬치와 다양한 생고기 요리를 제공하는 중식당",
        address = "시흥시 중심상가로 195 수창빌딩 2층",
        phoneNumber = "070-4833-9036",
        category = "소고기구이",
        recommendedMenu = "양꼬치, 생고기",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230912_87%2F1694485816325zJaFD_JPEG%2FIMG_7270.JPG"
    ),
    PlaceInfo(
        name = "현대옥",
        summary = "콩나물 국밥이 맛있는 국밥집",
        address = "시흥시 중심상가1길 14",
        phoneNumber = "031-432-1668",
        category = "국밥",
        recommendedMenu = "전주 끓이는 식 콩나물 국밥",
        photos = "http://imagefarm.baemin.com/smartmenuimage/upload/image/2020/3/27/cCptpUL2wKzP7cefotf8Yyzg1qMFgv0ZIZS1JJA6oOmzXqRumcFvyCTsQkILgWn_.jpg"
    ),
    PlaceInfo(
        name = "퀸즈포차",
        summary = "안주가 맛있는 요리주점",
        address = "시흥시 중심상가3길 22 월드프라자 2층 퀸즈포차",
        phoneNumber = "0507-1449-3939",
        category = "요리주점",
        recommendedMenu = "돼지김치구이, 마약크림 페투치네",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221213_76%2F1670911782323u3qgp_JPEG%2F1667795514728.jpg"
    ),
    PlaceInfo(
        name = "트랩",
        summary = "다양한 안주와 빙수가 맛있는 요리주점",
        address = "시흥시 중심상가3길 29 1층트랩",
        phoneNumber = "0507-1321-2068",
        category = "요리주점",
        recommendedMenu = "우삼겹 간장 숙주볶움",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240405_135%2F17122439439616Rr3w_JPEG%2FIMG_20240320_195216_064.jpg"
    ),
    PlaceInfo(
        name = "포차천국",
        summary = "다양한 안주와 음료를 제공하는 포차",
        address = "시흥시 중심상가3길 25 2층",
        phoneNumber = "031-319-1077",
        category = "포차",
        recommendedMenu = "곱도리탕, 치즈듬뿍 베이컨치즈 감자채전",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240429_101%2F1714320142703byA5X_JPEG%2FKakaoTalk_20240429_005815640_01.jpg"
    ),
    PlaceInfo(
        name = "한신포차",
        summary = "닭발이 맛있는 한신포차",
        address = "시흥시 마유로 336 정일빌딩",
        phoneNumber = "031-499-6885",
        category = "포차",
        recommendedMenu = "한신닭발+콩나물",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240424_65%2F1713920400963lscSR_JPEG%2F2024___%25AB%25E1_%25B5%25E1______%25AB%25E1_PR____%2528__%25AB%25E1____%25AA%25E1_%25A1%25E1__.jpg"
    ),
    PlaceInfo(
        name = "무적 회 포차",
        summary = "신선한 회와 다양한 안주를 제공하는 포차",
        address = "시흥시 중심상가3길 23 무적회포장마차",
        phoneNumber = "031-319-3446",
        category = "포차, 횟집",
        recommendedMenu = "모듬회, 생우럭탕",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjEyMzFfMTk4%2FMDAxNjcyNDYwNTExNzg2.Vib65j17GWeL8s-TxZPusQecNOVcFRYdV6AYPNoowE8g.m8GPVYnH7wJU_JnSLu_jid8vT8j5RznTSScyUVNdw70g.JPEG%2F20221229_222442.jpg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "보보스 PC",
        summary = "1호점 ~ 5호점 까지 있는 49블럭 대표 PC방",
        address = "시흥시 중심상가로 193 5층",
        phoneNumber = "0507-1332-1883",
        category = "PC방",
        recommendedMenu = "보보스 정식",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190205_194%2F1549367992000iChMD_JPEG%2FtSVykWzO2zfvlhfqtcqYnuGw.jpg"
    ),
    PlaceInfo(
        name = "레이지 그라운드",
        summary = "쾌적하고 조용한 49블럭 만화방",
        address = "시흥시 중심상가로 197 4층 402호",
        phoneNumber = "031-406-9996",
        category = "만화방",
        recommendedMenu = "",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210309_273%2F1615249592337WBPJq_JPEG%2FkpediYQMn78cNCwbsG5UJpQS.jpeg.jpg"
    ),
    PlaceInfo(
        name = "읍천리 382",
        summary = "샌드위치와 음료가 맛있는 읍천리",
        address = "시흥시 중심상가로 180 108호, 109호",
        phoneNumber = "0507-1350-1633",
        category = "카페, 샌드위치",
        recommendedMenu = "불고기 샌드위치, 자두 쥬스",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221102_236%2F1667380207048wMtwl_JPEG%2F1_%25B0%25A1%25B0%25D4_%25C0%25CC%25B9%25CC%25C1%25F6_%25281%2529.jpg"
    ),
    PlaceInfo(
        name = "CGV 정왕",
        summary = "아늑한 크기의 49 영화관",
        address = "시흥시 정왕대로 210 성담스퀘어 10층",
        phoneNumber = "1544-1122",
        category = "영화관",
        recommendedMenu = "팝콘, 나초",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20190909_31%2F1568029121469QDD5m_JPEG%2FNTQ2FVPVimOAvhpsv4omETX-.jpg"
    ),
    PlaceInfo(
        name = "킹스맨 보드카페",
        summary = "다양한 보드게임을 즐길 수 있는 카페",
        address = "시흥시 중심상가4길 16 2층 킹스맨 보드카페",
        phoneNumber = "0507-1314-2484",
        category = "보드카페",
        recommendedMenu = "인당 1시간 3천원(음료 미 주문 시 4천원)",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240329_148%2F1711695800267CDg1K_JPEG%2FKakaoTalk_20220608_210009985_20.jpg"
    ),
    PlaceInfo(
        name = "마리오짐",
        summary = "깔끔한 시설의 49 헬스장",
        address = "시흥시 중심상가 4길 30 4층",
        phoneNumber = "031-499-8222",
        category = "헬스장",
        recommendedMenu = "3개월 99,000",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200106_63%2F1578316222853mGOiI_JPEG%2FtCe9N1NXMDJQlGvKHIcdcrQN.jpg"
    ),
    PlaceInfo(
        name = "프렌드짐",
        summary = "넓고 다양한 기구가 있는 정왕 대표 헬스장",
        address = "시흥시 중심상가2길 20-5 JUJ빌딩 5층",
        phoneNumber = "0507-1330-9688",
        category = "헬스장",
        recommendedMenu = "5개월 20만원 이벤트 중",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230601_298%2F1685564463583sdvjb_JPEG%2FKakaoTalk_20230601_051328341_03.jpg"
    ),
    PlaceInfo(
        name = "HM 풋살 파크",
        summary = "넓은 카페가 있는 49블럭 풋살장",
        address = "시흥시 정왕대로233번길 19-1 HM풋살파크 시흥점",
        phoneNumber = "070-4940-8881",
        category = "풋살장",
        recommendedMenu = "",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200917_3%2F1600323382872dC77b_JPEG%2Fehste9KwqeqSVIBsWJ7fgEZc.jpg"
    ),
    PlaceInfo(
        name = "카페 더 피치",
        summary = "HM 풋살 파크 옆 카페",
        address = "시흥시 정왕대로233번길 19-1 카페더피치",
        phoneNumber = "0507-1411-8897",
        category = "카페",
        recommendedMenu = "크로플",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA1MDlfNDQg%2FMDAxNzE1MjQzNjQ0MTc2.RA1AsvN0NDqRDIxeND56TUNTxu9H4wikCqwMJdwM-Q8g.pe46pzh5BWtCCiCavz_sapLUEtwtmN_uwt9sPZGxCdgg.JPEG%2F11E49096-C2F9-4328-B25D-E1573739AF19.jpeg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "휘턴기구필라테스",
        summary = "배곧, 정왕 필라테스 만족도 1위",
        address = "경기 시흥시 중심상가2길 20-5 2층",
        phoneNumber = "0507-1321-6307",
        category = "필라테스",
        recommendedMenu = "개인 레슨 29,000",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA1MTdfMTAx%2FMDAxNzE1OTA0NDE2MzU0.uE-TjR-DKQbb2PvwsSUlMuPuq1vE0cDNjb8RlIIrqwsg.UjZNSzYlRNPmWZS1xlHZHLxkmlyLJOG4XtSIIRRrXzIg.JPEG%2Fimage.jpg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "디저트 39",
        summary = "49 디저트 39",
        address = "시흥시 중심상가2길 12-8 1층 102호",
        phoneNumber = "031-365-3090",
        category = "카페",
        recommendedMenu = "도쿄롤, 오믈렛 세트",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231215_141%2F1702604995385KdwTK_JPEG%2FKakaoTalk_20231212_180404473.jpg"
    ),
    PlaceInfo(
        name = "더존볼링장",
        summary = "넓고 깔끔한 49 볼링장",
        address = "경기 시흥시 중심상가1길 14 3층",
        phoneNumber = "031-319-9275",
        category = "볼링장",
        recommendedMenu = "대화료 1천원, 게임 당 3500원",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAyMDhfMTI0%2FMDAxNzA3MzU5MDI3OTky.JZHQGX3CLSb9PPkym4BN_F4rF0FQ7peduYl5GhEjPaAg.4KIS3BeOC9e02lwaddMsw9IEoEx-tjXjuByh7bKmo8wg.JPEG%2F9D729816-F2C0-4749-9B79-CE8936156671.jpeg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "리안헤어",
        summary = "",
        address = "시흥시 중심상가로 193 센타프라자 202호,203호",
        phoneNumber = "0507-1410-9713",
        category = "미용실",
        recommendedMenu = "",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221014_12%2F1665723044725H8RNS_JPEG%2FKakaoTalk_20221014_110119891_02.jpg"
    ),
    PlaceInfo(
        name = "코코코인 노래연습장 (Coco Coin Karaoke)",
        summary = "",
        address = "시흥시 중심상가3길 14 3층 301호,302호",
        phoneNumber = "031-8901-2345",
        category = "노래연습장",
        recommendedMenu = "1000원 2곡",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240208_37%2F1707396048987qsrVz_JPEG%2FKakaoTalk_20240208_214010471_04.jpg"
    ),
)

val FacilityList = listOf(
    PlaceInfo(
        name = "Tip GX룸",
        summary = "제 1기숙사 6층에 위치한 다목적체련실.",
        address = "시흥시 산기대학로 237 Tip 6층",
        phoneNumber = "031-8041-0100",
        category = "필라테스, 요가, 미러룸",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/gcN5cfD6/Kakao-Talk-20240528-090126350.jpg"
    ),
    PlaceInfo(
        name = "Tip 노래방",
        summary = "제 1기숙사 6층에 위치한 노래방.",
        address = "시흥시 산기대학로 237 Tip 6층",
        phoneNumber = "031-8041-0100",
        category = "노래방",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/ZnJ8tZjR/Kakao-Talk-20240528-160913935-19.jpg"
    ),
    PlaceInfo(
        name = "Tip 헬스장",
        summary = "제 1기숙사 6층에 위치한 헬스장.",
        address = "시흥시 산기대학로 237 Tip 6층",
        phoneNumber = "031-8041-0100",
        category = "헬스장",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/ydsgWjRp/Kakao-Talk-20240528-160913935-18.jpg"
    ),
    PlaceInfo(
        name = "Tip 라운지",
        summary = "제 1기숙사 1층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/GhNXHD5k/2024-05-28-151322.png"
    ),
    PlaceInfo(
        name = "하나 라운지",
        summary = "제 1기숙사 1층에 위치한 하나은행 소속 라운지.",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/v80qwk72/2024-05-28-151253.png"
    ),
    PlaceInfo(
        name = "Tip 2층 스터디 라운지",
        summary = "제 1기숙사 2층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 Tip 2층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/9FGD75xJ/Kakao-Talk-20240528-090126350-04.jpg"
    ),
    PlaceInfo(
        name = "Tip 2층 라운지",
        summary = "제 1기숙사 2층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 Tip 2층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/W3B4dXgB/Kakao-Talk-20240528-090126350-05.jpg"
    ),
    PlaceInfo(
        name = "Tip 3층 라운지",
        summary = "제 1기숙사 3층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 Tip 3층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/yxRkjw76/Kakao-Talk-20240528-090126350-03.jpg"
    ),
    PlaceInfo(
        name = "제2기숙사 1층 라운지",
        summary = "제 2기숙사 1층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 제 2기숙사 1층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/kGN7B9nS/Kakao-Talk-20240528-090126350-07.jpg"
    ),
    PlaceInfo(
        name = "제2기숙사 2층 라운지",
        summary = "제 2기숙사 2층에 위치한 라운지.",
        address = "시흥시 산기대학로 237 제 2기숙사 2층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/1zTmdJC8/Kakao-Talk-20240528-090126350-06.jpg"
    ),
    PlaceInfo(
        name = "종합교육관 라운지 채움",
        summary = "종합교육관 2층에 위치한 실내 라운지.",
        address = "시흥시 산기대학로 237 종합교육관 2층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/8cGS83hz/Kakao-Talk-20240528-090126350-13.jpg"
    ),
    PlaceInfo(
        name = "종합교육관 라운지 나눔",
        summary = "종합교육관 2층에 위치한 야외 라운지.",
        address = "시흥시 산기대학로 237 종합교육관 2층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/CKW07d5D/Kakao-Talk-20240528-090126350-09.jpg"
    ),
    PlaceInfo(
        name = "B동 라운지 배움",
        summary = "B동에 위치한 라운지.",
        address = "시흥시 산기대학로 237 B동 1층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/xjLfsGKd/Kakao-Talk-20240528-090126350-08.jpg"
    ),
    PlaceInfo(
        name = "D동 라운지 다룸",
        summary = "D동에 위치한 라운지.",
        address = "시흥시 산기대학로 237 D동 1층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/DfQhQvTJ/Kakao-Talk-20240528-090126350-18.jpg"
    ),
    PlaceInfo(
        name = "E동 라운지 이룸",
        summary = "E동에 위치한 라운지.",
        address = "시흥시 산기대학로 237 E동 5층",
        phoneNumber = "031-8041-0100",
        category = "라운지",
        recommendedMenu = "--",
        photos = "https://i.postimg.cc/VsFyrKqX/Kakao-Talk-20240528-094514941-02.jpg"
    ),
)
val OfficeList = listOf(
    PlaceInfo(
        name = "컴퓨터공학부 학과사무실",
        summary = "E동에 위치한 컴퓨터공학부 학과사무실",
        address = "시흥시 산기대학로 237 E동 1층",
        phoneNumber = "031-8041-0510",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/kG8gctWR/Kakao-Talk-20240528-094514941.jpg"
    ),
    PlaceInfo(
        name = "게임공학과 학과사무실",
        summary = "E동에 위치한 게임공학과 학과사무실",
        address = "시흥시 산기대학로 237 E동 1층",
        phoneNumber = "031-8041-0550",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/kG8gctWR/Kakao-Talk-20240528-094514941.jpg"
    ),
    PlaceInfo(
        name = "나노반도체공학과 학과사무실",
        summary = "P동에 위치한 나노반도체공학과 학과사무실",
        address = "시흥시 산기대학로 237 P동 5층",
        phoneNumber = "031.8041.0710",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/d3KYJNTD/Kakao-Talk-20240528-155120511-14.jpg"
    ),
    PlaceInfo(
        name = "경영학부 학과사무실",
        summary = "G동에 위치한 경영학부 학과사무실",
        address = "시흥시 산기대학로 237 G동 3층",
        phoneNumber = "031-8041-0670",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/pXXSKtxR/Kakao-Talk-20240528-155120511-01.jpg"
    ),
    PlaceInfo(
        name = "신소재공학과 학과사무실",
        summary = "D동에 위치한 신소재공학과 학과사무실",
        address = "시흥시 산기대학로 237 D동 2층",
        phoneNumber = "031-8041-0580",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/j5cXjLDN/Kakao-Talk-20240528-155120511-12.jpg"
    ),
    PlaceInfo(
        name = "생명화학공학과 학과사무실",
        summary = "D동에 위치한 생명화학공학과 학과사무실",
        address = "시흥시 산기대학로 237 D동 3층",
        phoneNumber = "031-8041-0610",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/8zvm6yFT/Kakao-Talk-20240528-155120511-10.jpg"
    ),
    PlaceInfo(
        name = "에너지전기공학과 학과사무실",
        summary = "C동에 위치한 에너지전기공학과 학과사무실",
        address = "시흥시 산기대학로 237 C동 3층",
        phoneNumber = "031-8041-0690",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/rpCGhKCb/Kakao-Talk-20240528-155120511-07.jpg"
    ),
    PlaceInfo(
        name = "기계설계공학과 학과사무실",
        summary = "B동에 위치한 기계설계공학과 학과사무실",
        address = "시흥시 산기대학로 237 B동 2층",
        phoneNumber = "031-8041-0420",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/KcsPsXBZ/Kakao-Talk-20240528-160913935-08.jpg"
    ),
    PlaceInfo(
        name = "메카트로닉스공학과 학과사무실",
        summary = "B동에 위치한 메카트로닉스공학과 학과사무실",
        address = "시흥시 산기대학로 237 B동 3층",
        phoneNumber = "031-8041-0450",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/XJY5QxvG/Kakao-Talk-20240528-160913935-10.jpg"
    ),
    PlaceInfo(
        name = "디자인공학부 학과사무실",
        summary = "A동에 위치한 디자인공학부 학과사무실",
        address = "시흥시 산기대학로 237 A동 4층",
        phoneNumber = "031-8041-0660",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/cCV81SBw/Kakao-Talk-20240528-160913935-11.jpg"
    ),
    PlaceInfo(
        name = "기계공학과 학과사무실",
        summary = "A동에 위치한 기계공학과 학과사무실",
        address = "시흥시 산기대학로 237 A동 2층",
        phoneNumber = "031-8041-0400",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/jd77gDRX/Kakao-Talk-20240528-160913935-12.jpg"
    ),
    PlaceInfo(
        name = "전자공학부 학과사무실",
        summary = "산학융합관에 위치한 전자공학부 학과사무실",
        address = "시흥시 산기대학로 237 산학융합관 5층",
        phoneNumber = "031-8041-0470",
        category = "학과사무실",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/WtLhL7s7/Kakao-Talk-20240528-155713368.jpg"
    ),
)

val SmokeAreaList =  listOf(
    PlaceInfo(
        name = "Tip 기숙사 뒷편",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/tTQ0PfvN/Kakao-Talk-20240528-090126350-20.jpg"
    ),
    PlaceInfo(
        name = "공학관 G동 뒷편",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/qqGdpLLX/Kakao-Talk-20240528-090126350-17.jpg"
    ),
    PlaceInfo(
        name = "행정동 옆",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/Wb9QStf3/Kakao-Talk-20240528-151001928.jpg"
    ),
    PlaceInfo(
        name = "산학융합관 옆",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/0y415rp3/Kakao-Talk-20240528-090126350-19.jpg"
    ),
    PlaceInfo(
        name = "Tip 기숙사 6층",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = "https://i.postimg.cc/52CfDwzy/Kakao-Talk-20240528-090126350-02.jpg"
    ),

    )
val OtherAreaList =  listOf(
    PlaceInfo(
        name = "큐브",
        summary = "Tip 앞 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/v8NQ1XFq/Kakao-Talk-20240528-160913935.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "제 2기숙사 출입구 옆 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/wjzn3sv4/Kakao-Talk-20240528-160913935-02.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "종합교육관 2층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/K8cgZJn9/Kakao-Talk-20240528-160913935-06.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "B동 1층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/3xcSmLFR/Kakao-Talk-20240528-155120511-08.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "G동 1층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/MZ4sffsb/Kakao-Talk-20240528-155120511-02.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "산학융합관 1층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/T1G3t30k/Kakao-Talk-20240528-155713368-02.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "C동 2층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/RZPG93nH/Kakao-Talk-20240528-155120511-09.jpg"
    ),
    PlaceInfo(
        name = "큐브",
        summary = "E동 2층 큐브",
        address = "24시간 무인 프린터기",
        phoneNumber = "02-1688-5677",
        category = "프린터기",
        recommendedMenu = "흑백 40원, 컬러 400원",
        photos = "https://i.postimg.cc/fbL207hC/Kakao-Talk-20240528-155120511.jpg"
    ),
    PlaceInfo(
        name = "증명서 발급기",
        summary = "Tip 1층 증명서 발급기",
        address = "각종 증명서발급기",
        phoneNumber = "070-8656-0551",
        category = "무인 발급기",
        recommendedMenu = "재학, 졸업, 성적증명서 등",
        photos = "https://i.postimg.cc/ydsM53qS/Kakao-Talk-20240528-160913935-04.jpg"
    ),
    PlaceInfo(
        name = "증명서 발급기",
        summary = "종합교육관 1층 증명서 발급기",
        address = "각종 증명서발급기",
        phoneNumber = "070-8656-0551",
        category = "무인 발급기",
        recommendedMenu = "재학, 졸업, 성적증명서 등",
        photos = "https://i.postimg.cc/XqH69jzB/Kakao-Talk-20240528-160913935-07.jpg"
    ),
    PlaceInfo(
        name = "증명서 발급기",
        summary = "행정동 증명서 발급기",
        address = "각종 증명서발급기",
        phoneNumber = "070-8656-0551",
        category = "무인 발급기",
        recommendedMenu = "재학, 졸업, 성적증명서 등",
        photos = "https://i.postimg.cc/TPDbShjG/Kakao-Talk-20240528-160913935-01.jpg"
    ),
)
val InCafeList =  listOf(
    PlaceInfo(
        name = "카페아이엔지",
        summary = "제 1기숙사 1층에 위치한 카페.",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "--",
        category = "카페",
        recommendedMenu = "아이스 아메리카노",
        photos = "https://i.postimg.cc/SQgjcsKg/Kakao-Talk-20240528-160913935-20.jpg"
    ),
    PlaceInfo(
        name = "쥬씨",
        summary = "제 1기숙사 1층에 위치한 카페.",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "--",
        category = "카페",
        recommendedMenu = "망고주스, 수박 주스",
        photos = "https://i.postimg.cc/Y0C9JcdN/Kakao-Talk-20240528-160913935-17.jpg"
    ),
    PlaceInfo(
        name = "토스피아",
        summary = "제 1기숙사 1층에 위치한 카페.",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "--",
        category = "토스트, 카페",
        recommendedMenu = "데리치즈 샌드위치, 치즈불고기 샌드위치",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjEyMDhfMjc2%2FMDAxNjcwNTA2ODkzMzYx.33VsUfrEx4ElF0x729CpVHy1ZZ0LwNQWPI2UPcttxgQg.UnNsL5SkBlPPLSWeDvrBOmO1H-yUo6F4UJmkn7PLvR0g.JPEG%2FScreenshot_20221207-174345_KakaoMap.jpg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "스터디카페",
        summary = "종합교육관 2층에 위치한 카페.",
        address = "시흥시 산기대학로 237 종합교육관 2층",
        phoneNumber = "--",
        category = "카페",
        recommendedMenu = "아이스초코",
        photos = "https://i.postimg.cc/G2chywn0/Kakao-Talk-20240528-090126350-11.jpg"
    ),
    PlaceInfo(
        name = "일리 카페",
        summary = "산학융합관 1층에 위치한 카페.",
        address = "시흥시 산기대학로 237 산학융합관 1층",
        phoneNumber = "--",
        category = "카페",
        recommendedMenu = "아이스 아메리카노",
        photos = "https://i.postimg.cc/g0JF3YBP/Kakao-Talk-20240528-184306860.jpg"
    ),
    PlaceInfo(
        name = "블루포트 경과기대점",
        summary = "경기과학기술대에 위치한 카페.",
        address = "경기 시흥시 경기과기대로 270",
        phoneNumber = "--",
        category = "카페",
        recommendedMenu = "아이스 아메리카노",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjA4MTlfNSAg%2FMDAxNjYwODY4OTU2MzQy.rfWtviWPHGnxiZ986raSt-6-smrUoyJnKiSrVjs-GPkg.LDE0Fw_QNd9y2rurcZlf8251pyi5lEfoRkEmWDLgX_0g.JPEG%2Fupload_230c021c1febe47016850df764005227.jpg%3Ftype%3Dw1500_60_sharpen"
    ),

    )
val InRestaurantList =  listOf(
    PlaceInfo(
        name = "E동 레스토랑",
        summary = "E동 1층에 위치한 교수님들이 애용하시는 식당",
        address = "시흥시 산기대학로 237 E동 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "뷔페식 학식",
        photos = "https://i.postimg.cc/NLq2rCgW/Kakao-Talk-20240528-094514941-01.jpg"
    ),
    PlaceInfo(
        name = "수호 식당",
        summary = "제 1기숙사 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "한식뷔페, 국밥류",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230620_234%2F1687253092676zbibg_JPEG%2F1687253084490.jpg"
    ),
    PlaceInfo(
        name = "버텍스",
        summary = "제 1기숙사 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "미국식 덮밥",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240320_171%2F1710944033502tXHFe_PNG%2F%25B4%25EB%25C7%25A5%25B7%25CE%25B0%25ED.png"
    ),
    PlaceInfo(
        name = "학생 식당 가가",
        summary = "제 1기숙사 B1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip B1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "뷔페식 학식",
        photos = "https://i.postimg.cc/P5KbBhfJ/2024-05-28-184902.png"
    ),
    PlaceInfo(
        name = "올리브그린",
        summary = "제 1기숙사 2층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip 2층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "김치볶음밥",
        photos = "https://i.postimg.cc/gkH3ZdZs/2024-05-28-185126.png"
    ),
    PlaceInfo(
        name = "라온 식당",
        summary = "종합교육관 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 종합교육관 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "라면+주먹밥세트",
        photos = "https://i.postimg.cc/R0NtyHbp/2024-05-28-185149.png"
    ),
    PlaceInfo(
        name = "토마토 도시락",
        summary = "산학융합관 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 산학융합관 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "불닭갈비도시락",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA3MDNfNzkg%2FMDAxNjg4MzYwMzg0NTIy.iKE89-6NK8WQJ3hEdE5Tq4iseJw4rlLyQnQ7CvyuzQwg.rK-6W9uNMo4pOnOBbj_-BESj1cUQ9s8AYyWh_dY60b4g.JPEG%2FA5E893AF-BBA4-4B0A-B6FF-9B06B1CA4317.jpeg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "나드리 김밥",
        summary = "산학융합관 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 산학융합관 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "제육덮밥, 참치김밥",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjExMzBfMjg4%2FMDAxNjY5NzY5MzE0NzUx.8Wf71mRzVVIdgF78Chs_6Ec9Qozx0itCN5qx2i1XVTMg.jI9XTnnYOROu9uHtKT52zLZqots2dvbpAkmMVBfXXmsg.JPEG%2FDFF56C34-4E30-4CBA-B334-82CFE3BF6F19.jpeg%3Ftype%3Dw1500_60_sharpen"
    ),
    PlaceInfo(
        name = "OG 버거",
        summary = "산학융합관 1층에 위치한 식당",
        address = "시흥시 산기대학로 237 산학융합관 1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "OG그릴드버거",
        photos = "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220829_271%2F1661754356930kBf8N_PNG%2F123.PNG"
    ),
    PlaceInfo(
        name = "신북경",
        summary = "제 1기숙사 B1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip B1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "마라탕, 불짜장",
        photos = "https://i.postimg.cc/3NT5z29g/2024-05-28-192709.png"
    ),
    PlaceInfo(
        name = "하나비",
        summary = "제 1기숙사 B1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip B1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "소금구이덮밥",
        photos = "https://i.postimg.cc/ryBKFHZJ/2024-05-28-192209.png"
    ),
    PlaceInfo(
        name = "한스오믈렛",
        summary = "제 1기숙사 B1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip B1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "연탄숯불구이+쫄면",
        photos = "https://i.postimg.cc/SsQxHFsS/2024-05-28-192115.png"
    ),
    PlaceInfo(
        name = "맘스터치",
        summary = "제 1기숙사 B1층에 위치한 식당",
        address = "시흥시 산기대학로 237 Tip B1층",
        phoneNumber = "--",
        category = "식당",
        recommendedMenu = "딥치즈싸이버거, 싸이버거",
        photos = "https://i.postimg.cc/cCbCQ9ds/2024-05-28-191748.png"
    ),

    )