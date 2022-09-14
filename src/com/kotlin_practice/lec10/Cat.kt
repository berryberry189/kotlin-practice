package com.kotlin_practice.lec10

// Animal 을 상속받음
class Cat (
    species: String
) : Animal(species, 4){

    override fun move() {
        println("사뿐사뿐 걸어가는 귀여운 아기 고양이")
    }

}