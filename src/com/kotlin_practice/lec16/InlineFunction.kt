package com.kotlin_practice.lec16

// inline 함수
// 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우 사용
// 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다
// but, inline 함수의 사용은 성능 측정과 함께 신중하게 사용되어야 한다

fun main() {

    // 사용방법
    3.add(4)
}

inline fun Int.add3(other: Int): Int {
    return this + other
}