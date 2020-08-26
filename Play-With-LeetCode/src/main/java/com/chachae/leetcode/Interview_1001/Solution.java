package com.chachae.leetcode.Interview_1001;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:10
 */
class Solution {

  public void merge(int[] a, int m, int[] b, int n) {

    int j = 0;
    for (int i = a.length - 1; i >= a.length - b.length; i--) {
      a[i] = b[j++];
    }
    Arrays.sort(a);
  }
}