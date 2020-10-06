package com.chachae.lanqiao.acwing.lanqiao;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/5 16:35
 * @version v1.0
 */
public class Main1205 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    boolean[] records = new boolean[a * a + b * b + 1];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        records[i * a + b * j] = true;
      }
    }
    for (int i = records.length - 1; i >= 0; i--) {
      if (!records[i] && i <= a * b) {
        System.out.println(i);
        return;
      }
    }
  }
}
