package com.kotlin_practice.lec14

fun main() {
    val personDto1 = PersonDto("김여주", 25)
    val personDto2 = PersonDto("김여주", 25)
    println(personDto1 == personDto2)
}



// 클래스 앞에 date 키워드를 붙이면
// 자동으로 equals, hasCode, toString 생성
data class PersonDto (
    val name: String,
    val age: Int,
)

