package com.chachae.lanqiao.java_group_b_2019.question_3;

import java.math.BigInteger;

/**
 * 给定数列1, 1, 1, 3, 5, 9, 17, …，从第4 项开始，每项都是前3 项的和。求 第20190324 项的最后4 位数字。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/25 23:56
 */
public class Main {

  public static void main(String[] args) {
    System.out.println(new Main().build(20190324));
  }

  public String build(long item) {
    BigInteger a = new BigInteger("1");
    BigInteger b = new BigInteger("1");
    BigInteger c = new BigInteger("1");
    BigInteger max = null;
    for (int i = 3; i < item; i++) {
      max = a.add(b).add(c);
      a = b;
      b = c;
      c = max;
    }
    String res = String.valueOf(max);
    return res.substring(res.length() - 4);
  }

}
