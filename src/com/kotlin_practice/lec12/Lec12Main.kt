package com.kotlin_practice.lec12

fun main() {

    // 익명 클래스
    moveSomething(object : Movable {
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("날다")
        }

    })
}


private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}