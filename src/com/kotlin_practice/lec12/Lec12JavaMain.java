package com.kotlin_practice.lec12;

public class Lec12JavaMain {

  public static void main(String[] args) {

    // 자바에서 코틀린의 static 사용 방법

    // @JvmStatic 안붙은 경우
    //Person.Factory.newBaby("ABC");

    // @JvmStatic 붙은 경우
    Person.newBaby("ABC");
  }

}
