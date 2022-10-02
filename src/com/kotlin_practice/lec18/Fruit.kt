package com.kotlin_practice.lec18

class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    // 확장함수 생성
    val isSamePrice: Boolean
      get() = factoryPrice == currentPrice
}