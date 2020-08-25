package com.chachae.leetcode.No_1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/delete-columns-to-make-sorted/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<Integer> minSubsequence(int[] nums) {
    Arrays.sort(nums);
    List<Integer> res = new ArrayList<>();
    int sum = Arrays.stream(nums).sum();
    int q = sum / 2;
    int n = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      n += nums[i];
      if (n <= q) {
        res.add(nums[i]);
      }
    }
    return res;
  }
}