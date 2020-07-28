package com.chachae.design.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 过滤器模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:54
 */
public class MainTest {

  private static final List<Person> persons = new ArrayList<>();
  private static final Random RANDOM = new Random();

  public static void main(String[] args) {
    for (int i = 0; i < 100000; i++) {
      persons.add(new Person(String.valueOf(RANDOM.nextInt()), RANDOM.nextInt(2)));
    }

    System.out.println(new MaleFilter().filterGender(persons).size());
    System.out.println(new FemaleFilter().filterGender(persons).size());
  }
}
