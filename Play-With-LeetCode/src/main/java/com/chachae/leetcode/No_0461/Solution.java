package com.chachae.leetcode.No_0461;

/**
 * https://leetcode-cn.com/problems/hamming-distance/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int hammingDistance(int x, int y) {
    int ans = 0;
    if (x == y) {
      return 0;
    }
    while (x != 0 || y != 0) {
      if (x % 2 != y % 2) {
        ++ans;
      }
      x = x / 2;
      y = y / 2;
    }
    return ans;

  }
}