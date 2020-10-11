package com.chachae.lanqiao.groupb_2019;

/**
 *
 * @author chachae
 * @date 2020/10/10 21:36
 * @version v1.0
 */
public class No03 {

  public static void main(String[] args) {
    int n = 20190324;
    int a = 1;
    int b = 1;
    int c = 1;
    for (int i = 4; i <= n; i++) {
      if (i % 3 == 1) {
        a = (a + b + c) % 10000;
      } else if (i % 3 == 2) {
        b = (a + b + c) % 10000;
      } else {
        c = (a + b + c) % 10000;
      }
    }
    if (n % 3 == 1) {
      System.out.println(a);
    } else if (n % 3 == 2) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }
}