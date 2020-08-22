package com.chachae.algorithm.imooc.dynamic_programming;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 13:31
 */
public class LongestIncreasingSubsequence {

  public static void main(String[] args) {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
    System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(nums));
  }

  public int lengthOfLIS(int[] nums) {

    if (nums == null || nums.length == 0) {
      return 0;
    }

    // 初始化状态，dp[i] 元素表示以其为结尾的最长上升子序列的长度
    int[] dp = new int[nums.length];
    Arrays.fill(dp, 1);

    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    return Arrays.stream(dp).max().getAsInt();
  }
}
