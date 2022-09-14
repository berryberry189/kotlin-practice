package com.kotlin_practice.lec10

class Penguin (
    species: String
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int = 2

    override fun move() {
        println("뒤뚱뒤뚱 걸어가는 사랑스러운 아기 펭귄")
    }

    override val legCount: Int
      get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act();
        super<Flyable>.act();

    }

}