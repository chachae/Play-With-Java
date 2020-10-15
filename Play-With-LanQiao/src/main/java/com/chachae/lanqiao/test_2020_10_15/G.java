package com.chachae.lanqiao.test_2020_10_15;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:58
 * @version v1.0
 */
public class G {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int end = in.nextInt();
    in.close();
    BigInteger sum = BigInteger.ZERO;
    for (int i = 1; i <= end; i++) {
      sum = sum.add(new BigInteger("" + i).pow(8));
    }
    System.out.println(sum.mod(new BigInteger("123456789")));
  }
}
