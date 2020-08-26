package com.chachae.leetcode.No_0026;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int removeDuplicates(int[] nums) {

    int indexOfSlow = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[indexOfSlow] != nums[i]) {
        nums[++indexOfSlow] = nums[i];
      }
    }
    return indexOfSlow + 1;
  }
}