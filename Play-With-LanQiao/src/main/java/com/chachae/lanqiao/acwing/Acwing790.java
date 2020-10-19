package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/16 11:43
 * @version v1.0
 */
public class Acwing790 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double n = scanner.nextDouble();
    double left = -10000;
    double right = 10000;
    while (right - left > 0.0000000001) {
      double mid = (left + right) / 2;
      if (Math.pow(mid, 3) > n) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.printf("%.6f", left);
  }
}