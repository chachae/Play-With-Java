package com.chachae.leetcode.No_1342;

/**
 * https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int numberOfSteps(int num) {
    int res = 0;
    while (num > 0) {
      ++res;
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num -= 1;
      }
    }
    return res;
  }
}