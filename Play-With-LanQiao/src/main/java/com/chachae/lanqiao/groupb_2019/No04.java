package com.chachae.lanqiao.groupb_2019;

/**
 *
 * @author chachae
 * @date 2020/10/10 21:38
 * @version v1.0
 */
public class No04 {

  static int[] a = new int[2019 + 1];

  public static void main(String[] args) {
    int n = 2019;
    for (int i = 1; i < a.length; i++) {
      a[i] = 1;
      String str = String.valueOf(i);
      if (str.contains("2") || str.contains("4")) {
        a[i] = 0;
      }
    }

    int cnt = 0;
    for (int a = 1; a < n / 3 + 1; a++) {
      if (check(a)) {
        for (int b = a + 1; b < n; b++) {
          if (check(b)) {
            for (int c = b + 1; c < n; c++) {
              if (a + b + c > n) {
                break;
              }
              if (check(c)) {
                if (a + b + c == n) {
                  cnt++;
                }
              }
            }
          }
        }
      }
    }
    System.out.println(cnt);
  }

  //判断i中的数字是否有2 或者4
  private static boolean check(int i) {
    return a[i] == 1;
  }
}
