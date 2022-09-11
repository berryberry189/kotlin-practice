package com.kotlin_practice.lec7

// 1. try catch finally 구문
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch(e : NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫지기 아닙니다")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch(e : NumberFormatException) {
        null
    }
}


