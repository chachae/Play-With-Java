package com.chachae.lanqiao.test_2020_10_15;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:53
 * @version v1.0
 */
public class F {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] chs = in.nextLine().toCharArray();
    in.close();
    int up = 0, low = 0, num = 0;
    for (char ch : chs) {
      if (ch >= 65 && ch <= 90) {
        ++up;
      } else if (ch >= 97 && ch <= 122) {
        ++low;
      } else if (ch >= 48 && ch <= 57) {
        ++num;
      }
    }
    System.out.printf("%s%n%s%n%s", up, low, num);
  }
}
