package com.kotlin_practice.lec3

import com.kotlin_practice.lec1.Person

// 2. 타입캐스팅
fun main() {

    printAgeIfPersonNullable(null)
    printAgeIfPersonNullable(Person("김여주", 25))
}

fun printAgeIfPerson(obj : Any) {
    if(obj is Person) { // java 의 instanceof 와 동일
        val person = obj as Person // java의 (Person)obj , as Person 은 생략 가능!!
        println(person.age)
    }

    if(obj !is Person) { // obj 가 person 이 아니면
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonNullable(obj : Any?) {
    val person = obj as? Person
    println(person?.age)
}