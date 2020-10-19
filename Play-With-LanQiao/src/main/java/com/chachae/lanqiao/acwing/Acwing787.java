package com.chachae.lanqiao.acwing;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/16 12:00
 * @version v1.0
 */
public class Acwing787 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    Arrays.sort(arr);
    for (int e : arr) {
      System.out.print(e + " ");
    }
  }
}
