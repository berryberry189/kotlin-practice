package com.kotlin_practice.lec1

// 1. var 과 val 의 차이점
fun main() {

    // java long(가번) 과 final long(불변)
    // 코틀린에서는 모든 변수에 수정가능여부(var/val)을 표시해야한다
    // 가변 variable 약자
    var number1_1 = 10L;
    number1_1 = 5L;

    // 불변 value 약자
    val number2_1 = 10L;
    // number2_1 = 5L; // 컴파일 에러

    // 타입을 쓰지 않으면 코틀린이 알아서 타입을 추론하지만, 명시할 수도 있다
    var number1_2 : Long = 10L;
    val number2_2 : Long = 10L;

    // 초기값을 지정하지 않는 경우 - 명시적으로 타입을 작성해주어야한다
    var number1_3 : Long
    val number2_3 : Long

    // val 컬렉션에는 element를 추가할 수 있다
    // java code ex)
    //      final List<Integer> numberList = List.of(1,2,3);
    //      numberList.add(4); 가능

    // Tip!! : 모든 변수는 우선 val(불변)로 만들고 꼭 핋요한 경우 var(가변)로 변경한다



}