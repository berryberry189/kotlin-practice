package com.kotlin_practice.lec14

fun handlerCar(car: HyundaiCar) {
    when(car) {
        is Avante -> TODO()
        is Granduer -> TODO()
        is Sonata -> TODO()
    }
}


// sealed 클래스
// 실드 클래스를 상요하면 컴파일 때 하위 클래스의 타입을 모두 기억한다
// 즉, 런타임때 클래스 타입이 추가될 수 없다
// when expression 과 함께 사용하면 효과가 좋다
// 추상화가 필요한 entity 나 dto에 sealed class 를 활요하면 좋다

sealed class HyundaiCar (
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1000)
class Sonata : HyundaiCar("소나타", 2000)
class Granduer : HyundaiCar("그랜저", 3000)