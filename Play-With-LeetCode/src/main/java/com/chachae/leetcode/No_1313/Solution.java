package com.chachae.leetcode.No_1313;

/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int[] decompressRLElist(int[] nums) {
    int len = 0;
    for (int i = 0; i < nums.length; i += 2) {
      len += nums[i];
    }
    int[] ans = new int[len];
    int index = 0;
    for (int i = 0; i < nums.length; i += 2) {
      for (int j = 0; j < nums[i]; j++) {
        ans[index++] = nums[i + 1];
      }
    }
    return ans;
  }
}