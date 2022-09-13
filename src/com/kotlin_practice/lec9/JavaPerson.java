package com.kotlin_practice.lec9;

public class JavaPerson {

  private final String name; // 불변이므로 setter 만들 수 X
  private int age;

  public JavaPerson(String name, int age) {
    if(this.age <= 0) {
      throw new IllegalStateException(String.format("나이는 "+ age +"일 수 없습니다"));
    }
    this.name = name;
    this.age = age;
  }

  public JavaPerson(String name) {
    this(name, 1);
  }


  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
