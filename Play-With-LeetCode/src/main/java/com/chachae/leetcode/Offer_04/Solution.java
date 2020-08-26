package com.chachae.leetcode.Offer_04;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    for (int[] a : matrix) {
      //  [1,   4,  7, 11, 15],
      int low = 0;
      int high = a.length - 1;
      while (low <= high) {
        int mid = (low + high) / 2;
        long midVal = a[mid];
        if (midVal < target) {
          low = mid + 1;
        } else if (midVal > target) {
          high = mid - 1;
        } else {
          return true;
        }
      }
    }
    return false;
  }
}