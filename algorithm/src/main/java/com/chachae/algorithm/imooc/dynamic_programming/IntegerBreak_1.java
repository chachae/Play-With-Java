package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/integer-break/ 记忆化搜索解法（超时）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 10:31
 */
public class IntegerBreak_1 {

  private int max3(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

  private int breakInteger(int n) {
    if (n == 1) {
      return 1;
    }

    int res = -1;

    for (int i = 1; i <= n - i; i++) {
      res = max3(res, i * (n - i), i * breakInteger(n - i));
    }
    return res;
  }

  public int integerBreak(int n) {
    return breakInteger(n);
  }
}
