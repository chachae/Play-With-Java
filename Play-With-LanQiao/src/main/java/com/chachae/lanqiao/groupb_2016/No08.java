package com.chachae.lanqiao.groupb_2016;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/10 14:45
 * @version v1.0
 */
public class No08 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double e = Math.sqrt(n);
    for (int i = 0; i <= (int) e; i++) {
      for (int j = i; j <= (int) e; j++) {
        for (int k = j; k <= (int) e; k++) {
          for (int l = k; l <= (int) e; l++) {
            if (i * i + j * j + k * k + l * l == n) {
              System.out.printf("%s %s %s %s", i, j, k, l);
              System.exit(0);
            }
          }
        }
      }
    }
  }
}