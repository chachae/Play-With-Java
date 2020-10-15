package com.chachae.lanqiao.test_2020_10_15;

/**
 *
 * @author chachae
 * @date 2020/10/15 19:36
 * @version v1.0
 */
public class C {

  public static void main(String[] args) {
    int min = 1 + 100;
    int ans = Integer.MAX_VALUE;
    for (int i = 2; i <= 10000; i++) {
      int c = Math.min(min, i + 100 / i);
      if (c != min && 100 % i == 0) {
        ans = i;
        min = c;
      }
    }
    System.out.println(ans);
  }
}