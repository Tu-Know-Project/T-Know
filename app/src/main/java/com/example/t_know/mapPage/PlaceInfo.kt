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
        photos = "url"
    ),
    PlaceInfo(
        name = "참나무누룽닭",
        summary = "숯불에 구운 닭",
        address = "시흥시 중심상가 3길 31-1",
        phoneNumber = "0507-1484-5222",
        category = "구운 치킨, 숯불 구이 닭",
        recommendedMenu = "누룽지 통닭 + 콘치즈 폭포",
        photos = "url"
    ),
    PlaceInfo(
        name = "형제들 감자탕",
        summary = "49블럭 감자탕 맛집",
        address = "시흥시 중심상가 2길 22",
        phoneNumber = "031-496-0833",
        category = "감자탕",
        recommendedMenu = "뼈해장국, 감자탕",
        photos = "url"
    ),
    PlaceInfo(
        name = "커리파라다이스",
        summary = "현지 쉐프의 커리를 맛 볼 수 있는 곳",
        address = "시흥시 중심상가 2길 22 2층 201호",
        phoneNumber = "010-5965-6185",
        category = "커리, 인도 음식",
        recommendedMenu = "버터 난 + 마크니, 갈릭 난 + 빈달루",
        photos = "url"
    ),
    PlaceInfo(
        name = "돈통마늘보쌈",
        summary = "보쌈 정식 맛집",
        address = "시흥시 중심상가로 181 삼화빌딩 1층",
        phoneNumber = "031-497-5382",
        category = "보쌈, 한정식",
        recommendedMenu = "마늘 보쌈 정식",
        photos = "url"
    )
    // 평양왕족발순대, 콩받, 고가네, 메챠쿠챠 돈까스, 샤브린

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
        name = "Tip(기술혁신파크)",
        summary = "제 1기숙사, 여러 편의시설이 있다.",
        address = "시흥시 산기대학로 237 Tip",
        phoneNumber = "031-8041-0100",
        category = "기숙사, 라운지, 편의시설",
        recommendedMenu = "--",
        photos = "https://i.namu.wiki/i/4JwTTddYCPmbsPLI9eSXpSLquSuu_-_5Q0jeFm21FGAFJllcBeEW6qEY25fXA2UP4hwd61d4CNzwoNOpjplo0w.webp"
    ),
    )
val OfficeList = listOf(
    PlaceInfo(
        name = "",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = ""
    ),
)
val SmokeAreaList =  listOf(
    PlaceInfo(
        name = "",
        summary = "",
        address = "",
        phoneNumber = "",
        category = "",
        recommendedMenu = "",
        photos = ""
    ),)