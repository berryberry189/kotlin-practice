package com.kotlin_practice.lec9


fun main() {
    val person = Person("김여주", 25)
    val baby = Person("김아기")
    println(person.name)
    person.age = 20
    println(person.age)

    /*val javaPerson = JavaPerson("김여주", 25)
    println(javaPerson.name)
    javaPerson.age = 20
    println(javaPerson.age)*/

    Person()
}


// constructor 지시어 생략 가능
// 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다
// 주 셍성자는 반드시 존재해야한다
class Person (
    name: String,
    var age:Int
) {

    // custom getter, setter
    // field 사용 이유?
    // name.함수 를 사용하면 무한루프를 돌게 되기 때문에 그것을 막기위해 예약어(자기자신)을 사용한다
    val name = name
      get() = field.uppercase()

    /*var name: String = name
      set(value) {
          field = value.uppercase()
      }*/


    // init 블럭: 생성자가 호출되는 시점에 시작되는 블록
    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // 나이가 무조건 1인 생성자 추가
    constructor(name: String): this(name, 1){
        println("첫 번째 부생성자")
    }

    constructor(): this("김주연") {
        println("두 번째 부생성자")
    }

    // 프로퍼티 추가
    val isAdult: Boolean
      get() = this.age >= 20
//      get() {
//        return this.age >= 20
//      }


}

/*class Person (
    val name: String,
    var age:Int
)*/

/*
class Person constructor(name: String, age:Int){
    val name = name
    val age = age
}*/
