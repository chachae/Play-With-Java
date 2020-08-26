package com.chachae.leetcode.Offer_57;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int[] twoSum(int[] nums, int target) {
    int len = nums.length;
    int start = 0;
    int end = len - 1;
    for (int i = 1; i < len; i++) {
      int r = nums[start] + nums[end];
      if (r == target) {
        return new int[]{nums[start], nums[end]};
      } else if (r > target) {
        --end;
      } else {
        ++start;
      }
    }
    return null;
  }
}