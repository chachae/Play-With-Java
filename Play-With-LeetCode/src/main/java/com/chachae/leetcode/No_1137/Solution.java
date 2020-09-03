package com.chachae.leetcode.No_1137;

/**
 * https://leetcode-cn.com/problems/n-th-tribonacci-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int tribonacci(int n) {
    if (n == 0 || n == 1 || n == 2) {
      return n == 0 ? 0 : 1;
    }
    int a = 0, b = 1, c = 1;
    int result = 0;
    for (int i = 3; i <= n; i++) {
      result = a + b + c;
      a = b;
      b = c;
      c = result;
    }
    return result;
  }
}