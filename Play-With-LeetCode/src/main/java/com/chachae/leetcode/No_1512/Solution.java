package com.chachae.leetcode.No_1512;

/**
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int numIdenticalPairs(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i < j && nums[i] == nums[j]) {
          ++count;
        }
      }
    }
    return count;
  }
}