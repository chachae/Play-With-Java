package com.chachae.leetcode.No_0657;

/**
 * https://leetcode-cn.com/problems/robot-return-to-origin/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution_2 {

  public boolean judgeCircle(String moves) {
    int[] dir = new int[26];

    char[] chs = moves.toCharArray();
    for (char ch : chs) {
      ++dir[ch - 'A'];
    }
    return dir['R' - 'A'] == dir['L' - 'A'] && dir['U' - 'A'] == dir['D' - 'A'];
  }
}