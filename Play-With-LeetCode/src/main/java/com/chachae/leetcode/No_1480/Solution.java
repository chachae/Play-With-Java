package com.chachae.leetcode.No_1480;

/**
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  // 输入：nums = [1,2,3,4]
  //输出：[1,3,6,10]
  //解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

  public int[] runningSum(int[] nums) {

    if (nums.length == 1) {
      return nums;
    }

    int[] res = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      res[i] = sum;
    }

    return res;
  }
}