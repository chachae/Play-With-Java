package com.chachae.leetcode.Interview_0805;

/**
 * https://leetcode-cn.com/problems/recursive-mulitply-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:10
 */
class Solution {

  public int multiply(int A, int B) {
    long res = 0;
    while (B > 0) {
      if ((B & 1) == 1) {
        res = res + A;
      }
      A = A + A;
      B = B >> 1;
    }
    return (int) res;
  }
}