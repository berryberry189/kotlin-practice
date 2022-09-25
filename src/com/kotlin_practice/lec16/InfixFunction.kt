package com.kotlin_practice.lec16

// 중위함수

fun main() {

    // 사용방법
    3.add(4)

    3.add2(4)
    3 add2 4 // 중위함수

}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}