package com.kotlin_practice.lec13

fun main() {

}

// 중첩 클래스
// 클래스안에 클래스가 있는 경우는 2가지
    // java 기준 static 을 사용하는 클래스 => 권장
    // java 기준 static 을 사용하지 않는 클래스
// 코틀린에서는 위의 가이드를 따르기 위해
    // 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조가 없고
    // 바깥 클래스를 참조 하고 싶다면 inner 키워드를 붙여야 한다 (livingRoom2)
// 코틀린 inner class 에서 바깥 클래스를 참조하려면
    // 'this@바깥클래스'를 사용해야 한다.

class House(
    val address: String,
    val livingRoom: LivingRoom, // 내부 클래스 참조 가능
    val livingRoom2: LivingRoom2
) {

    // 자바에서 권장하는 중첩 클래스
    class LivingRoom (
        private val area: Double
    )

    // 자바의 내부 클래스 (권장하지 않는 클래스안의 클래스)
    inner class LivingRoom2(
        private val area: Double
    ) {
        val address: String
          get() = this@House.address
    }

}