package com.kotlin_practice.lec15

fun main() {

    // 불변
    val numbers = listOf(100, 200)
    // empty list는 타입 지정 필수
    val emptyList = emptyList<Int>()

    // 타입 추론이 가능할 때는 타입을 써주지 않아도 된다
    printNumbers(kotlin.collections.emptyList())

    val numberSet = setOf(100, 200)

    val map = mapOf(1 to "가나다", 2 to "마바사")


    // 가변
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)
    val numberSet2 = mutableSetOf(100, 200)
    val map2 = mutableMapOf<Int, String>()
    map2.put(1, "가나다")
    map2[1] = "마바사"

    for (key in map2.keys) {
        println(key)
        println(map2.get(key))
        println(map2[key])
    }

    for ((key, value) in map2.entries) {
        println(key)
        println(value
        )
    }


}

private fun printNumbers(numbers: List<Int>) {

}