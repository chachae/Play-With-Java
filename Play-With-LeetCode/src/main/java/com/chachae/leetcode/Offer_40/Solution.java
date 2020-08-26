package com.chachae.leetcode.Offer_40;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int[] getLeastNumbers(int[] arr, int k) {
    Arrays.sort(arr);
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[0] = arr[i];
    }
    return res;
  }
}