package com.chachae.lanqiao.groupb_2013;

/**
 *
 * @author chachae
 * @date 2020/10/5 19:58
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    int ans = 0;
    for (int a = 1; a <= 9; a++) {
      for (int b = 1; b <= 9; b++) {
        if (a != b) {
          for (int c = 1; c <= 9; c++) {
            if (c != a && c != b) {
              for (int d = 1; d <= 9; d++) {
                if (d != a && d != b && d != c) {
                  for (int e = 1; e <= 9; e++) {
                    if (e != a && e != b && e != c && e != d) {
                      if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
                        ans++;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
}