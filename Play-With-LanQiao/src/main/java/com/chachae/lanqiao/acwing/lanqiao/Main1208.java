package com.chachae.lanqiao.acwing.lanqiao;

import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/5 16:35
 * @version v1.0
 */
public class Main1208 {

  public static void reverse(char[] a, int i) {
    a[i] = a[i] == 'o' ? '*' : 'o';
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    in.close();
    int result = 0;
    char[] arrayA = a.toCharArray();
    char[] arrayB = b.toCharArray();
    for (int i = 0; i < arrayA.length - 1; i++) {
      if (arrayA[i] != arrayB[i]) {
        reverse(arrayA, i);
        reverse(arrayA, i + 1);
        result++;
      }
    }
    System.out.println(result);
  }
}
