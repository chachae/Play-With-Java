package com.chachae.leetcode.No_1502;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean canMakeArithmeticProgression(int[] arr) {
    if (arr.length < 3) {
      return true;
    }
    Arrays.sort(arr);
    int diff = arr[1] - arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] != diff) {
        return false;
      }
    }
    return true;
  }
}