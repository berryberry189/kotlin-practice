package com.kotlin_practice.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // companion object : 동반객체 -> 하나의 객체로 간주되며 이름을 붙일 수 도 있고 interface를 구현할 수도 있다
    companion object Factory : Log{
        // static 함수 사용법
        // const : 런타임 시가 아닌 컴파일 시에 변수가 할당된다, 진짜 상수에 사용하기 위한 용도
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행객체 Factory")
        }
    }
}

// 싱글톤
// object -> 싱글톤 키워드
object Singleton{
    var a: Int = 0
}