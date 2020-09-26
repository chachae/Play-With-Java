package com.chachae.leetcode.No_1304;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int[] sumZero(int n) {
    int[] ans = new int[n];
    int h = 0, t = 0;
    for (int i = 0, l = n - 1; i < n / 2; i++, l--) {
      ans[i] = ++h;
      ans[l] = --t;
    }
    return ans;
  }
}