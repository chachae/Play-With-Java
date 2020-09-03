package com.chachae.leetcode.Offer_10_I;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int fib(int n) {
    if (n <= 1) {
      return n;
    }
    int first = 0;
    int second = 1;
    int result = 0;
    while (--n > 0) {
      result = first + second;
      if (result >= 1000000007) {
        result -= 1000000007;
      }
      first = second;
      second = result;
    }
    return result;
  }
}