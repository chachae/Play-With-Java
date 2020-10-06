package com.chachae.lanqiao.groupb_2014;

import java.util.HashSet;
import java.util.Set;

/**
 * https://blog.csdn.net/hyx153183740/article/details/104163097
 *
 * @author chachae
 * @date 2020/10/6 14:43
 * @version v1.0
 */
public class No07 {

  static Set<String> set = new HashSet<>();

  public static void main(String[] args) {
    char[] a = {'A', 'A', '2', '2', '3', '3', '4', '4'};
    f(a, 0);
    for (String s : set) {
      System.out.println(s);
    }
  }

  private static void f(char[] a, int k) {
    if (k == a.length) {
      String s = new String(a);
      if (check(s)) {
        // System.out.println(s);
        set.add(s);
      }
    }
    for (int i = k; i < a.length; i++) {
      char t = a[k];
      a[k] = a[i];
      a[i] = t;
      f(a, k + 1);
      t = a[k];
      a[k] = a[i];
      a[i] = t;
    }

  }

  private static boolean check(String str) {
    return str.lastIndexOf('A') - str.indexOf('A') == 2 && str.lastIndexOf('2') - str.indexOf('2') == 3
        && str.lastIndexOf('3') - str.indexOf('3') == 4 && str.lastIndexOf('4') - str.indexOf('4') == 5;
  }

}
