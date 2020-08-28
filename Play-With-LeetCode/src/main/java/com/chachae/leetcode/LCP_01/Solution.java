package com.chachae.leetcode.LCP_01;

/**
 * https://leetcode-cn.com/problems/guess-numbers/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {
  public int game(int[] guess, int[] answer) {
    int count = 0;
    for (int i = 0; i < guess.length; i++) {
      if (guess[i] == answer[i]) {
        ++count;
      }
    }
    return count;
  }
}