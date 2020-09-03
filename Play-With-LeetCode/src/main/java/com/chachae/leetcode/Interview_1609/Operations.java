package com.chachae.leetcode.Interview_1609;

import java.math.BigInteger;

class Operations {

  public Operations() {

  }

  public int minus(int a, int b) {
    return BigInteger.valueOf(a).subtract(BigInteger.valueOf(b)).intValue();
  }

  public int multiply(int a, int b) {
    return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).intValue();
  }

  public int divide(int a, int b) {
    return BigInteger.valueOf(a).divide(BigInteger.valueOf(b)).intValue();
  }
}