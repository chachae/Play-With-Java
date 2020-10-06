package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * https://www.acwing.com/problem/content/719/
 *
 * @author chachae
 * @date 2020/10/6 11:49
 * @version v1.0
 */
public class Acwing717 {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int end = sc.nextInt();
    sc.close();

    if (end <= 1) {
      System.out.println(0);
      return;
    }

    int a = 0;
    int b = 1;
    int ans;
    int start = 0;
    System.out.print(a + " " + b + " ");
    while (start++ < end - 2) {
      ans = a + b;
      a = b;
      b = ans;
      System.out.print(ans + " ");
    }
  }
}