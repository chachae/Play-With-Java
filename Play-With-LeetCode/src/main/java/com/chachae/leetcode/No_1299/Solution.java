package com.chachae.leetcode.No_1299;

/**
 * https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int[] replaceElements(int[] arr) {
    if (arr.length == 1) {
      return new int[]{-1};
    }

    int end = 0;
    int len = arr.length;
    while (end != len) {

      int max = -1;
      for (int i = end + 1; i < len; i++) {
        max = Math.max(arr[i], max);
      }
      arr[end++] = max;
    }

    return arr;
  }
}