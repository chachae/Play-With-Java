package com.chachae.leetcode.Offer_17;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int[] printNumbers(int n) {

    int len = (int) Math.pow(10, n) - 1;
    int[] res = new int[len];
    for (int i = 1; i <= len; i++) {
      res[i - 1] = i;
    }

    return res;
  }
}