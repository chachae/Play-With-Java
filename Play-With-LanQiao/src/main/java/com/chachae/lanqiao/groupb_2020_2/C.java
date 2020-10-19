package com.chachae.lanqiao.groupb_2020_2;

public class C {

  public static void main(String[] args) {
    // 5 = 41
    // 6 = 61
    // 7 = 86
    // 8 = 113
    int ans = 113;
    int d = 32;
    int h = 20;
    int k = h - 8;
    for (int i = 0; i < k; i++) {
      ans += d;
      d += 4;
    }
    System.out.println(ans);
  }
}
