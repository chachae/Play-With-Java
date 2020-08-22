package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/climbing-stairs/ （会超时，详见第二版）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 23:19
 */
public class ClimbingStairs_1 {

  public int climbStairs(int n) {

    if (n == 0 || n == 1) {
      return 1;
    }

    return climbStairs(n - 1) + climbStairs(n - 2);
  }
}
