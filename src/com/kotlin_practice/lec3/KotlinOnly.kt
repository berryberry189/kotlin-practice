package com.kotlin_practice.lec3

import com.kotlin_practice.lec1.Person

// 3. 코틀린의 특이한 타입 3가지
fun main() {

    // Any
    // Java 의 Object 역할 (모든 객체의 최상위 타입)
    // 모든 Primitive Type의 최상위 타입도 Any다
    // Any자체로는 null을 포함할 수 없어 null을 포함하고 싶다면 Any?로 표현
    // Any에 equlas / hashCode / toString 존재재


    // Unit
    // Java 의 void 와 동일한 역할
    // void 와 다르게 Unit은 그 자체로 타입 인자로 사용가능
    // 함수현 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미
    // 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현

    // Nothing
    // 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
    // 무조건 예외를 반환하는 함수 / 무한 루프 함수 등

    // String interpolation / String indexing
    // 문자열 타입 - java String or StringBuilder 등
    val person = Person("김여주", 25)
    // 중괄호 생략가능하나 사용하는 것이 좋다(가독성 등)
    val log = "이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    println(log)

    // 여러 줄에걸친 문자열 작성 """
    val log2 = """
        안녕하세요
        저는 ${person.name}이고 
        나이는 ${person.age}세 입니다.
    """.trimIndent()
    println(log2)

    // 특정문자 가져오기
    val str = "ABCDEFG"
    println(str[0])
    println(str[2])

}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message);
}