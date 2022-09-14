package com.kotlin_practice.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 프로퍼티를 오버라이드 하려면 open 키워드를 붙여야한다

) {
    abstract fun move()
}