package com.chachae.lanqiao.test_2020_10_15;

import java.math.BigInteger;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:49
 * @version v1.0
 */
public class E {

  public static void main(String[] args) {
    BigInteger fib520 = calFib(520);
    BigInteger fib2020 = calFib(2020);
    System.out.println(fib520.gcd(fib2020).toString()); // 6765
  }

  private static BigInteger calFib(int index) {
    index -= 2;
    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.ONE;
    BigInteger ans = BigInteger.ZERO;
    while (index-- != 0) {
      ans = a.add(b);
      a = b;
      b = ans;
    }
    return ans;
  }
}
