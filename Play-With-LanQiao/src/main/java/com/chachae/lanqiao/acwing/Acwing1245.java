package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/12 21:16
 * @version v1.0
 */
public class Acwing1245 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int end = in.nextInt();
    in.close();
    int ans = 0;
    for (int i = 1; i <= end; i++) {
      if (check(i)) {
        ans += i;
      }
    }
    System.out.println(ans);
  }

  private static boolean check(int n) {
    String str = String.valueOf(n);
    return str.contains("2") || str.contains("0") || str.contains("1") || str.contains("9");
  }
}
