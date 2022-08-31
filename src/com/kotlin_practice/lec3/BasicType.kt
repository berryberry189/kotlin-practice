package com.kotlin_practice.lec3

// 1. 기본타입
fun main() {

    val number3_1 = 3    // Int
    val number3_2 = 3L   // Long
    val number3_3 = 3.0f // float
    val number3_4 = 3.0  // double

    // 자바에서는 기본타입의 변환이 암시적으로 이루어지지만
    // 코틀린에서는 기본타입의 변환이 명시적으로 이루어진다 -> to변환타입을 사용해야함
    val number3_5 = 3
    val number3_6 : Long = number3_5.toLong()

    // nullable 변수면 적절한 처리가 필요하다

    val number3_7 : Int? = 3
    val number3_8 : Long = number3_7?.toLong() ?: 0L



}