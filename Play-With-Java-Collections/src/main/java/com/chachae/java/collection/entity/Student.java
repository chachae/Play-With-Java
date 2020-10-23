package com.chachae.java.collection.entity;

import java.io.Serializable;

/**
 *
 * @author chachae
 * @date 2020/10/20 21:26
 * @version v1.0
 */
public class Student implements Serializable {

  private String name;

  private Integer age;

  public Student() {

  }

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
