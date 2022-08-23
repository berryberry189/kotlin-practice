package com.kotlin_practice.lec2

// 2. Safe call 과 Evis 연산자
fun main() {

    val str: String? = "ABC";
    println(str?.length)
    // evis 연산자 : 앞의 연산 결과가 null이면 뒤의 값을 사용
    str?.length ?: 0

}

fun startsWithA2_1(str : String?) : Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어있습니다.")
}
fun startsWithA2_2(str : String?) : Boolean? {
    return str?.startsWith("A") ?: null
}
fun startsWithA2_3(str : String?) : Boolean {
    return str?.startsWith("A") ?: false
}
