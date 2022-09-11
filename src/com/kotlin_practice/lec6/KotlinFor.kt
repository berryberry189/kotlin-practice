package com.kotlin_practice.lec6

fun main() {

    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers) {
        // for 문 ':' 대신 in 사용
        println(number)
    }

    for(i in 1..3) {
        // for(int i=0; i<3; i++) 와 동일
        println(i)
    }

    // 내려가는 경우
    for(i in 3 downTo 1) {
        println(i)
    }

    // 2개씩 올라가는 경우
    for(i in 1..5 step 2) {
        println(i)
    }

    // 동작 원리
    // .. 연산자 : 범위 연산자 (1..3 : 1에서 시작하고 3으로 끝나는 공차가 1인 등차수열)
    // 1..5 step 2 => 1. 1부터 5까지 등차수열 생성 2.등차수열.step(2) 등차수열의 step 이라는 함수 호출
    // downTo 와 step 도 함수이다 (중위함수)


    // while 문
    // java 와 완전히 동일하다

}