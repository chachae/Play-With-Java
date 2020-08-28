package com.chachae.leetcode.LCP_06;

/**
 * https://leetcode-cn.com/problems/na-ying-bi/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int minCount(int[] coins) {
    int count = 0;
    for (int coin : coins) {
      if (coin % 2 == 0) {
        count += (coin / 2);
      } else {
        count += (coin / 2 + 1);
      }
    }
    return count;
  }
}