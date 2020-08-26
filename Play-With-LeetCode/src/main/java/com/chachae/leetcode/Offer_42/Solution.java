package com.chachae.leetcode.Offer_42;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int maxSubArray(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int max = dp[0];
    for (int i = 1; i < nums.length; i++) {
      dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
      max = Math.max(max, dp[i]);
    }
    return max;
  }

  public int maxSubArray2(int[] nums) {
    int sum = 0, max = nums[0];
    for (int num : nums) {
      sum += num;
      max = Math.max(max, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return max;
  }

}