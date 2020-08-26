package com.chachae.leetcode.Offer_03;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int findRepeatNumber(int[] nums) {
    int[] arr = new int[nums.length];
    for (int num : nums) {
      arr[num]++;
      if (arr[num] > 1) {
        return num;
      }
    }
    return -1;
  }
}