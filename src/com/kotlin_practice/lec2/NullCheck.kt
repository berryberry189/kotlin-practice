package com.kotlin_practice.lec2

// 1. kotlin 에서의 null 체크
fun startsWithA1_1(str : String?) : Boolean {
    if(str == null) {
        throw IllegalArgumentException("null 이 들어있습니다.")
    }
    return str.startsWith("A")
}
fun startsWithA1_2(str : String?) : Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}
fun startsWithA1_3(str : String?) : Boolean {
    if(str == null) {
        return false
    }
    return str.startsWith("A")
}

