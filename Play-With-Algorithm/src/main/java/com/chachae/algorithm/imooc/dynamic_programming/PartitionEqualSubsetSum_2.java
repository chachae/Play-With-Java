package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/partition-equal-subset-sum/ DP
 * <p>
 * 输入: [1, 5, 11, 5]
 * <p>
 * 输出: true
 * <p>
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 15:30
 */
public class PartitionEqualSubsetSum_2 {

  public boolean canPartition(int[] nums) {
    if (nums.length == 0) {
      return true;
    }
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % 2 == 1) {
      return false;
    }
    int target = sum >> 1;
    boolean[][] dp = new boolean[nums.length][target + 1];
    dp[0][0] = true;
    for (int i = 0; i < nums.length; ++i) {
      for (int j = 0; j <= target; ++j) {
        if (i == 0) {
          dp[i][j] = (nums[i] == j);
        } else {
          dp[i][j] = (dp[i - 1][j]) || (j - nums[i] >= 0 && dp[i - 1][j - nums[i]]);
        }
      }
    }
    return dp[nums.length - 1][target];
  }
}
