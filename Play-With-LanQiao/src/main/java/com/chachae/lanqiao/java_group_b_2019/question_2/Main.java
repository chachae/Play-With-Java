package com.chachae.lanqiao.java_group_b_2019.question_2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/25 23:56
 */
public class Main {

  public static void main(String[] args) {
    String s1 = "aaab";
    String s2 = "0100110001010001";
    System.out.println(subSum(s1));
    System.out.println(subSum(s2));

  }

  public static int subSum(String s) {
    Set<String> set = new HashSet<>();
    for(int i = 0; i < s.length(); i++) {
      for(int j = i ; j < s.length(); j++) {
        set.add(s.substring(i, j + 1 ));
      }
    }
    return set.size();
  }

}
