package com.chachae.leetcode.No_1005;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int largestSumAfterKNegations(int[] A, int K) {
    Arrays.sort(A);
    for (int i = 0; i < A.length; i++) {
      if (A[i] < 0 && K > 0) {
        A[i] = -A[i];
        K--;
      }
    }
    Arrays.sort(A);
    if (K % 2 != 0) {
      A[0] = -A[0];
    }
    int result = 0;
    for (int index : A) {
      result += index;
    }
    return result;
  }
}