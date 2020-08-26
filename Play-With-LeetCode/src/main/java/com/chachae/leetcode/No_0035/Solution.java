package com.chachae.leetcode.No_0035;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int searchInsert(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        return i;
      }
    }
    return nums.length;
  }
}