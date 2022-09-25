package com.kotlin_practice.lec16

// 지역함수
// depth 가 깊어지기도 하고 코드가 깔끔해지지 않아서 많이 사용하지 X
fun main() {
    createPerson2("김", "여주")
}

fun createPerson(firstName: String, lastName: String): Person {
    if(firstName.isEmpty()) {
        throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값: $firstName")
    }

    if(lastName.isEmpty()) {
        throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값: $lastName")
    }

    return Person(firstName, lastName, 1)
}

// 위 함수의 중복되는 부분 변경
fun createPerson2(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if(name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값: $name")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}