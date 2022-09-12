package com.kotlin_practice.lec8

fun main() {

    // 2.
    repeat("HelloWorld1")
    repeat("HelloWorld2", 2)
    repeat("HelloWorld3", 2, false)

    // 매개변수 이름을 통해 직접 자정할 수 있다
    // builder 를 직접 만들지 않고 builder 의 장점을 가지게 된다
    // but, 코틀린에서 자바 함수를 가져다 사용할 때는 named argument 를 사용할 수 없다
    repeat("HelloWorld3", useNewLine =  false)
    printNameAndGender(gender = "FEMALE", name = "김여주")


    // 3.
    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array) // 배열을 바로 넣지 않고 스프레드 연산자(*)를 붙여주어야 한다


}

// 1. 함수선언문법
// public 은 생략 가능
// 함수를 바로 = 으로 표현할 수 있음
// =을 사용하는 경우 함수의 : Int 타입 생략 가능
// if else 구문의 중괄호도 생략가능
fun max(a: Int, b:Int): Int =
     if(a > b) {
        a
    } else {
        b
    }

fun max2(a: Int, b:Int) = if(a > b) a else b


// 2. default parameter
// java 의 오버로딩

// 밖에서 파라미터를 넘겨주지 않는 경우 default 값을 사용
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for(i in 1..num) {
        if(useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 3. 가변인자
fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}
