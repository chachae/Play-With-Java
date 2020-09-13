package com.chachae.leetcode.No_1464;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int maxProduct(int[] nums) {
    Arrays.sort(nums);
    return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
  }
}