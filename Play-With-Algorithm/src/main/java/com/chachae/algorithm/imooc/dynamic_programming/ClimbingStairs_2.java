package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/ （动态规划）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 23:19
 */
public class ClimbingStairs_2 {

  public int climbStairs(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    int a = 1;
    int b = 1;
    int res = 0;
    for (int i = 2; i <= n; i++) {
      res = a + b;
      a = b;
      b = res;
    }
    return res;
  }
}
