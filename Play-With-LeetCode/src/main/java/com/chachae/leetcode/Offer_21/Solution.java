package com.chachae.leetcode.Offer_21;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int[] exchange(int[] nums) {
    int slow = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 1) {
        swap(nums, i, slow++);
      }
    }
    return nums;
  }

  private void swap(int[] target, int a, int b) {
    int temp = target[a];
    target[a] = target[b];
    target[b] = temp;
  }
}