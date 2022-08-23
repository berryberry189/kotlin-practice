package com.kotlin_practice.lec2

// 3. null 아님 단언

fun main() {
    println(startsWithA3("ABC"))
}

fun startsWithA3(str : String?) : Boolean {
    return str!!.startsWith("A")
}