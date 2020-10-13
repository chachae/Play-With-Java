package com.chachae.lanqiao.acwing;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * https://www.acwing.com/problem/content/2067/
 *
 * @author chachae
 * @date 2020/10/11 16:20
 * @version v1.0
 */
public class Acwing2065 {

  private static final BigInteger de = BigInteger.valueOf(2L);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    print(new BigInteger(sc.next()));
  }

  private static void print(BigInteger n) {
    if (n.compareTo(BigInteger.ZERO) > 0) {
      System.out.print(n + " ");
      print(n.divide(de));
    }
  }
}
