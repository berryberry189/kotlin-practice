package com.kotlin_practice.lec11

// 1. 접근지정자 (가시성지시어)
// java 와 다른점
// protected ->  선언된 클래스 or 하위 클래스에서만 접근가능 (패키지 빠짐)
// default -> internal 같은 모듈에서만 접근 가능 (default 사라짐)
// 코틀린의 기본 접근지정자는 public 이다 (자바는 default)

// 2. 코틀린 파일의 접근 제어
// 코틀린의 .kt 파일에 변수, 함수, 클래스 여러개를 바로 만들 수 있다
// protected 는 파일(최상단)에는 사용불가능하다

// 3. 다양한 구성요소의 접근제어
// 단 생성자에 접근 지시어를 붙이려면 constructor 을 써줘야 한다
class Cat private constructor ()

// 4. 자바와 코틀린을 함께 사용할 때 주의점
// internal 은 바이트 코드상 public 이 되므로
// 자바코드에서는 코틀린 모듈의 internal 코드를 가져올 수 없다
