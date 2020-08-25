package com.chachae.leetcode.No_1046;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/last-stone-weight/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int lastStoneWeight(int[] stones) {
    Arrays.sort(stones);
    int len = stones.length;
    for (int i = len - 1; i > 0; --i) {
      if (stones[len - 1] == 0) {
        return stones[len - 1];
      } else {
        stones[len - 1] = stones[len - 1] - stones[len - 2];
        stones[len - 2] = 0;
        Arrays.sort(stones);
      }
    }
    return stones[len - 1];
  }
}