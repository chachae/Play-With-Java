package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/12 20:34
 * @version v1.0
 */
public class Acwing1216 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.close();
    int ans = n;
    while (n >= 3) {
      int newN = n / 3;
      n = newN + n % 3;
      ans += newN;
    }
    System.out.println(ans);
  }
}
