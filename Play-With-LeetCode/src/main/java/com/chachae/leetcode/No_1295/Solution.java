package com.chachae.leetcode.No_1295;

/**
 * https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (check(num)) {
        ++count;
      }
    }
    return count;
  }

  private boolean check(int num) {
    int count = 0;
    while (num > 0) {
      num /= 10;
      ++count;
    }
    return count % 2 == 0;
  }
}