package com.chachae.lanqiao.groupb_2018;

/**
 *
 * @author chachae
 * @date 2020/10/10 17:04
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    int d = 1000, ans = 0;
    for (int i = 1; i <= d; i++) {
      for (int j = 1; j <= d; j++) {
        if (i * i + j * j <= d * d) {
          ans++;
        }
      }
    }
    System.out.println(ans * 4);
  }
}