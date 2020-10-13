package com.chachae.lanqiao.acwing;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/12 20:19
 * @version v1.0
 */
public class Acwing1211 {

  public static void main(String args[]) {
    int L = 0, R = 0;
    Scanner cn = new Scanner(System.in);
    int n = cn.nextInt();
    int[] kk = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      kk[i] = cn.nextInt();
    }
    for (int i = 2; i <= n; i++) {
      boolean b = Math.abs(kk[1]) < Math.abs(kk[i]) && kk[i] < 0;
      boolean c = Math.abs(kk[1]) > Math.abs(kk[i]) && kk[i] > 0;
      if (kk[1] > 0) {
        if (b) {
          R++;
        }
        if (c) {
          L++;
        }
      } else {
        if (b) {
          R++;
        }
        if (c) {
          L++;
        }
      }
    }
    if (L != 0 || R != 0) {
      System.out.println(R + L + 1);
    } else {
      System.out.println(1);
    }
  }

}
