package com.chachae.leetcode.No_1365;

/**
 * https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j && nums[i] > nums[j]) {
          res[i]++;
        }
      }
    }
    return res;
  }
}