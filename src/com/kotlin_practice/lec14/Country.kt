package com.kotlin_practice.lec14

fun handleCountry(country: Country) {
    // enum 분기 처리 시 when 을 사용하여 읽기 쉽고 컴파일러 체크를 할 수 있는 로직작성이 가능하다
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        // else 작성할 필요 없음
    }
}


enum class Country (
    private val code: String
){
    KOREA("KO"),
    AMERICA("USA")
    ;

}