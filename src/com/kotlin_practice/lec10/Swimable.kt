package com.kotlin_practice.lec10

interface Swimable {

    // java 에서는 안되지만 kotlin 에서는 인터페이스에 프로퍼티 추가 가능
    // getter 에 대한 오버라이드를 상속받는 클래스에서 할 수 있음
    val swimAbility: Int
      get() = 3

    fun act() {
        println("어푸 어푸")
    }
}