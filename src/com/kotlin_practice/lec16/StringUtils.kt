package com.kotlin_practice.lec16

// 확장함수
    // 수신객체 타입
fun String.lastChar() : Char{
    return this[this.length-1]
}

// 확장함수에서는 클래스에 있는
// private 또는 protected 멤버를 가져올 수 없다

// 멤버함수(Person)와 확장함수(nextYearAge)의 시그니처가 같다면?! => 멤버 함수가 우선적으로 호출된다
fun Person.nextYearAge(): Int {
    println("확장함수")
    return this.age + 1;
}

// 확장함수가 오버라이딩 된다면?!
open class Train(
    val name: String = "새마을기차",
    val price: Int = 5000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}


fun main() {
    val str = "ABC"
    println( str.lastChar() )

    val person = Person("A", "B", 100)
    person.nextYearAge()

    val train: Train = Train()
    train.isExpensive() // Train의 확장함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train의 확장함수

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt의 확장함수


}