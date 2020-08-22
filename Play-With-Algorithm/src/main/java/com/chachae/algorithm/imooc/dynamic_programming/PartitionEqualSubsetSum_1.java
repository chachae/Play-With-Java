package com.chachae.algorithm.imooc.dynamic_programming;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/partition-equal-subset-sum/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 15:30
 */
public class PartitionEqualSubsetSum_1 {

  private int[][] dp;

  public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    int max = Arrays.stream(nums).max().getAsInt();
    if (sum % 2 == 1 || max > sum / 2) {
      return false;
    } else {
      dp = new int[nums.length][sum / 2 - 1];
      return dfs(nums, sum / 2, nums.length - 1);
    }
  }

  private boolean dfs(int[] nums, int sum, int index) {
    if (sum == 0) {
      return true;
    }
    if (sum < 0 || index < 0) {
      return false;
    }

    if (dp[index][sum] != 0) {
      return dp[index][sum] == 1;
    }

    dp[index][sum] = dfs(nums, sum, index - 1) || dfs(nums, sum - nums[index], index - 1) ? 1 : -1;
    return dp[index][sum] == 1;
  }
}
