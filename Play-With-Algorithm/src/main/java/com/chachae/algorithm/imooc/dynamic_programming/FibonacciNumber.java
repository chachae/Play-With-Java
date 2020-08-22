package com.chachae.algorithm.imooc.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 23:11
 */
public class FibonacciNumber {

  public static void main(String[] args) {
    System.out.println(new FibonacciNumber().fib(4));
  }

  public int fib(int N) {
    Map<Integer, Integer> record = new HashMap<>();
    record.put(0, 0);
    record.put(1, 1);
    if (N == 0) {
      return record.get(0);
    } else if (N == 1) {
      return record.get(1);
    }
    for (int i = 2; i <= N; i++) {
      record.put(i, record.get(i - 1) + record.get(i - 2));
    }
    return record.get(N);
  }
}
