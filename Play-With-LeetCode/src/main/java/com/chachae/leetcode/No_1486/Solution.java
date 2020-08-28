package com.chachae.leetcode.No_1486;

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int xorOperation(int n, int start) {
    if (n == 1) {
      return start;
    }
    return (start + 2 * (n - 1)) ^ xorOperation(n - 1, start);
  }
}