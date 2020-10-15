package com.chachae.lanqiao.test_2020_10_15;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/15 20:14
 * @version v1.0
 */
public class H {

  public static void main(String[] args) {

    System.out.println('8' - '0');

    Scanner input = new Scanner(System.in);
    String s = input.next();
    int len = s.length();
    char[] c = s.toCharArray();
    int i;
    for (i = 0; i < len - 1; i++) {
      int a = c[i] - '0';
      int b = c[i + 1] - '0';
      int ans = a * 10 + b;
      if (ans < 27) {
        char ch = (char) (ans + 64);
        System.out.print(ch);
        i++;
      } else {
        char ch = (char) (a + 64);
        System.out.print(ch);
      }
    }
    if (i < len) {
      char ch = (char) (c[i] - '0' + 64);
      System.out.print(ch);
    }
  }
}

