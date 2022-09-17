package com.kotlin_practice.lec11

class Car(
    internal val name: String, // getter, setter 모두 internal
    private val owner: String, // getter, setter 모두 private
    _price: Int
) {
    var price = _price
      private set // price getter 는 public, setter 는 private 설정
}