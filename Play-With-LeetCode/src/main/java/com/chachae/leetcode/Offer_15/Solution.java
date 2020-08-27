package com.chachae.leetcode.Offer_15;

/**
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
public class Solution {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    return Integer.bitCount(n);
  }
}