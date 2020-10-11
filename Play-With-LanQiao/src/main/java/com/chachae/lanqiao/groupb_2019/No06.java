package com.chachae.lanqiao.groupb_2019;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/10 22:04
 * @version v1.0
 */
public class No06 {

  private static boolean check(int n) {
    char[] chs = String.valueOf(n).toCharArray();
    for (char ch : chs) {
      if (ch == '2' || ch == '0' || ch == '1' || ch == '9') {
        return true;
      }
    }
    return false;
  }

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
}
