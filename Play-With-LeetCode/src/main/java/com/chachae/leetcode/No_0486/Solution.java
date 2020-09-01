package com.chachae.leetcode.No_0486;

/**
 * https://leetcode-cn.com/problems/predict-the-winner/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean PredictTheWinner(int[] nums) {
    int len = nums.length;
    int[][] dp = new int[len][len];
    for (int k = 0; k < len; k++) {
      for (int i = 0, j = i + k; j < len; i++, j++) {
        if (k == 0) {
          dp[i][j] = nums[i];
        } else {
          dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
        }
      }
    }
    return dp[0][len - 1] >= 0;
  }
}