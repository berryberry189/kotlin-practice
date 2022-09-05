package com.kotlin_practice.lec4

// 1. 단한 연산자 / 산술 연산자
// 2. 비교 연산자와 동등성, 동일성
// 3. 논리연산자/ 코틀린에 있는 특이한 연산자
// 4. 연산자 오버로딩

fun main() {
    // 1. 단한 연산자 / 산술 연산자
    // ++ -- / + - * / % => 자바와 완전 동일

    // --------------------------------------

    // 2. 비교 연산자와 동등성, 동일성
    // > < >= <= 사용은 동일
    // 자바와 다르게 객체를 비교할때 비교연산자를 사용하면 자동으로 compareTo를 호출해준다
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)
    val money3 = JavaMoney(2000L)

    if(money1 > money2) {
        println("money1이 money2 보다 금액이 큽니다")
    }
    // 동등성 : 두 객체의 값이 같은가
        // java : ==     / kotlin : ===
    // 동일성 : 두 객체다 완전히 동일한 객체인가(주소가 같은가)
        // java : equals / kotlin : == (==을 호출하면 간접적으로 equals를 호출해준다)
    println(money1 === money3)
    println(money1 == money3)

    // --------------------------------------

    // 3. 논리연산자/ 코틀린에 있는 특이한 연산자
    // && || ! java 와 동일하며 java 처럼 lazy 연산을 수행한다
    // 코틀린에 있는 특이한 연산자
        // in / !in : 컬렉션이나 범위에 포함되어 있다, 포함되어있지 않다
        // a..b : a 부터 b 까지 범의 객체를 생성한다
        // a[i] : a 에서 특정 index i 로 값을 가져온다
        // a[i] = b : a 의 특정 index i 에 b 를 넣는다

    // --------------------------------------

    // 4. 연산자 오버로딩
    // 코틀린에서는 객체마다 연산자를 직접 정의할 수 있다
    val money4 = JavaMoney(1000L)
    val money5 = JavaMoney(2000L)
    println(money4 + money5)


}