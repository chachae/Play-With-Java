package com.chachae.leetcode.No_0657;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/robot-return-to-origin/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean judgeCircle(String moves) {

    HashMap<Character, Integer> dir = new HashMap<>();
    dir.put('R', 1);
    dir.put('L', -1);
    dir.put('U', 1);
    dir.put('D', -1);
    int a = 0;
    int b = 0;
    for (int i = 0; i < moves.length(); i++) {
      char c = moves.charAt(i);
      if (c == 'R' || c == 'L') {
        a += dir.get(c);
      } else {
        b += dir.get(c);
      }
    }

    return a == 0 && b == 0;
  }

  public boolean judgeCircle2(String moves) {
    int[] dir = new int[26];

    char[] chs = moves.toCharArray();
    for (char ch : chs) {
      ++dir[ch - 'A'];
    }
    return dir['R' - 'A'] == dir['L' - 'A'] && dir['U' - 'A'] == dir['D' - 'A'];
  }
}