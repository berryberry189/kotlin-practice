package com.kotlin_practice.lec17

// 코틀린에서의 람다
// 자바와 다르게 코틀린에서는 함수가 그 자체로 값이 될 수 있다
// 변수에 할당할 수도, 파라미터로 넘길 수도 있다.
fun main() {

    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("배", 5000),
        Fruit("복숭아", 4000),
        Fruit("수박", 20000),
        Fruit("멜론", 9000),
        Fruit("포도", 16000),
        Fruit("딸기", 8000),
        Fruit("바나나", 4500),
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 함수 호출 방법
    isApple(fruits[0])
    isApple.invoke(fruits[0])


    // 모두 동일
    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과" }


    // closure
    // 자바에서는 람다를 쓸 때 사용할수 있는 변수에 제약이 있다
    // (람다 밖의 변수 사용에 제약이 있음)
    // but, 코틀린은 문제 없이 작동한다
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName }

}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

class Fruit(
    val name: String,
    val price: Int
)