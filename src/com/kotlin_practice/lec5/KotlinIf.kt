package com.kotlin_practice.lec5

fun validateScoreInNotNegative(score: Int) { // void 생략 가능
    if(score < 0) {
        // new 사용X
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
    if(score !in 0..100) {
        // if(0<=score && score <= 100) 동일
        throw IllegalArgumentException("${score}는 0보다 크고 100보다 작습니다.")
    }
}


fun getPassOrFail(score: Int): String {

    // java에서 if-else는 statement지만 kotlin에서는 expression 이다.
    // statement : 프로그램의 문장, 하나의 값으로 도출되자 않는다
    // expression : 하나의 값으로 도출되는 문장 (statement 중 하나의 값으로 도출되는 것이 expression)
    // -> 그러므로 3항연산자가 없다

    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else if(score >= 80) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when(score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithRangeSwitch(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithStringA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false;
    }
}

fun judgeNumber(number: Int) {
    when (number) {
       1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 0 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")

    }
}




