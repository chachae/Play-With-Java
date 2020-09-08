package com.chachae.leetcode.No_0007;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int reverse(int x) {
    long n = 0;
    while (x != 0) {
      n = n * 10 + x % 10;
      x = x / 10;
    }
    return (int) n == n ? (int) n : 0;
  }
}