package com.chachae.leetcode.Offer_58;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public String reverseLeftWords(String s, int n) {
    return s.substring(n) + s.substring(0, n);
  }
}