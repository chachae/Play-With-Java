package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/house-robber/  DP
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 11:23
 */
public class HouseRobber_1 {

  private int tryRob(int[] nums, int index, int[] dp) {
    if (nums.length <= index) {
      return 0;
    }

    if (dp[index] != 0) {
      return dp[index];
    }
    int res = -1;
    for (int i = index; i < nums.length; i++) {
      res = Math.max(res, nums[i] + tryRob(nums, index + 2, dp));
      dp[index] = res;
    }
    return res;
  }

  public int rob(int[] nums) {
    if (nums == null) {
      return 0;
    }
    int[] dp = new int[nums.length];
    return tryRob(nums, 0, dp);
  }
}
