package com.chachae.leetcode.Offer_64;

/**
 *
 * @author chachae
 * @date 2020/10/13 21:10
 * @version v1.0
 */
class Solution {

  public int sumNums(int n) {
    return (int) (Math.pow(n, 2) + n) >> 1;
  }
}