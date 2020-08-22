package com.chachae.algorithm.imooc.dynamic_programming;

/**
 * https://leetcode-cn.com/problems/house-robber/  DP
 * <p>
 * 写状态转移方程的三个重点
 * <p>
 * 状态：房子的编号（或者说当前房子的位置）。 操作：偷和不偷当前所在的房子 结果：获得的钱
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 11:23
 */
public class HouseRobber_2 {

  public int rob2(int[] nums) {
    int a = 0;
    int b = 0;
    for (int num : nums) {
      int c = Math.max( a + num,b);
      a = b;
      b = c;
    }
    return b;
  }

  public int rob(int[] nums) {

    int len = nums.length;

    if (len <= 1) {
      return len == 0 ? 0 : nums[0];
    }

    int[] dp = new int[len];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < len; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }

    return dp[len - 1];
  }
}
