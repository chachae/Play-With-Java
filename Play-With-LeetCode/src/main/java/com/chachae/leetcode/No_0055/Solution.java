package com.chachae.leetcode.No_0055;

/**
 * https://leetcode-cn.com/problems/jump-game/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  boolean canJump(int[] nums) {
    int len = nums.length;
    if (len <= 1) {
      return true;
    }

    // [2,3,1,1,4]

    int maxDis = nums[0];

    for (int i = 1; i < len - 1; i++) {
      if (i <= maxDis) {
        maxDis = Math.max(maxDis, nums[i] + i);
      }
    }

    return maxDis >= len - 1;
  }
}