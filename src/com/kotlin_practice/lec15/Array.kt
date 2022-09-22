package com.kotlin_practice.lec15

fun main() {

    val array = arrayOf(100, 200)
    // 방법1
    for (i in array.indices) {
        println("${i}, ${array[i]}")
    }

    // 방법2
    for ((idx, value)in array.withIndex()) {
        println("$idx, $value")
    }

    // add == plus
    array.plus(300)
}