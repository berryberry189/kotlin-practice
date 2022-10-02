package com.kotlin_practice.lec18

fun main() {

    val fruits = listOf(
        Fruit(1, "사과", 800, 1000),
        Fruit(2, "배", 3500, 5000),
        Fruit(3, "복숭아", 3000, 4000),
        Fruit(4, "수박", 15000, 20000),
        Fruit(5, "멜론", 6500, 9000),
        Fruit(6, "포도", 12000, 16000),
        Fruit(7, "딸기", 6000, 8000),
        Fruit(8, "바나나", 3000, 4500),
    )

    // 사과만 추출
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    // 인덱스가 필요한 경우
    fruits.filterIndexed{ idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    // 사과의 가격
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map {fruit -> fruit.currentPrice }
    // map 에서 인덱스가 필요한 경우
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed{ idx, fruit ->
            println(idx)
            fruit.currentPrice
        }
    // mapping 의 결과가 null 이 아닌 것만 가져오고 싶은 경우
    fruits.filter {fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit == null}

    // all : 조건을 모두 만족하면 true 그렇지 않으면 false
    fruits.all { fruit -> fruit.name == "사과" }
    // none : 주어진 조건을 모두 불만족하면 true 그렇지 않으면 false
    // any : 조건을 하나라도 만족하면 true 그렇지 않으면 false

    // first : 첫번째 값을 가져온다 (무조건 null이 아니어야함)
    // firstOrNull : 첫번째 값 또는 null을 가져온다

    // List -> Mpa 변환
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    // 단일 객체가 들어가는 버전
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }



    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 800, 1000),
            Fruit(2, "배", 5000, 5000),
            Fruit(3, "복숭아", 3000, 4000),
            Fruit(4, "수박", 15000, 20000),
        ),
        listOf(
            Fruit(5, "멜론", 6500, 9000),
            Fruit(6, "포도", 12000, 16000),
            Fruit(7, "딸기", 6000, 8000),
        ),
        listOf(
            Fruit(8, "바나나", 4500, 4500),
        )
    )


    // 중첩된 컬렉션 처리
    // Q. 출고가와 현재가가 동일한 과일은?
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    // 위와 동일
    fruitsInList.flatMap { list -> list.samePriceFilter}

    // 중첩 해제
    val flattenFruits: List<Fruit> = fruitsInList.flatten()


}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)