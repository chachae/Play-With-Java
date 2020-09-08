package com.chachae.leetcode.No_0088;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p = m-- + n-- - 1;
    while (m >= 0 && n >= 0) {
      nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
    }

    while (n >= 0) {
      nums1[p--] = nums2[n--];
    }
  }
}