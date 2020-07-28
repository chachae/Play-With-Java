package com.chachae.design.structural.filter;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 16:29
 */
public class Person {

  private String name;
  private Integer genderCode;

  public Person(String name, Integer genderCode) {
    this.name = name;
    this.genderCode = genderCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getGenderCode() {
    return genderCode;
  }

  public void setGenderCode(Integer genderCode) {
    this.genderCode = genderCode;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", genderCode=" + genderCode +
        '}';
  }
}
