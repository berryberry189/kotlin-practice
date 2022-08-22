package com.kotlin_practice.lec1

// 3. nullable 변수
fun main() {

    // java Long -> null 이 들어갈 수도 있다
    // kotlin 에서는 기본적으로 모든 변수에 null 이 들어갈 수 없게 설계 해놓았다
    var number = 1000L;
    // number = null; // 컴파일 에러

    // null 을 넣고싶은경우에는 타입?를 추가로 작성해야한다
    var number_nullable : Long? = 1000L;
    number_nullable = null;
}