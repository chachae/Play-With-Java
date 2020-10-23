package com.chachae.java.collection.collections;

import cn.hutool.core.util.RandomUtil;
import com.chachae.java.collection.entity.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author chachae
 * @date 2020/10/20 21:28
 * @version v1.0
 */
public class SortTest {

  private static void sort() {

    List<Student> list = new ArrayList<>(1000);
    for (int i = 0; i < 1000; i++) {
      int n = RandomUtil.randomInt(1, 100);
      list.add(new Student(String.valueOf(n), n));
    }

    list.sort(Comparator.comparingInt(Student::getAge));

    for (Student student : list) {
      System.out.println(student);
    }

  }

  public static void main(String[] args) {
    sort();
  }

}
