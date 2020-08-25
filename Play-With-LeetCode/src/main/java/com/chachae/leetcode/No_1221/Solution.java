package com.chachae.leetcode.No_1221;

/**
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int balancedStringSplit(String s) {
    if (s == null || s.length() <= 1) {
      return 0;
    }

    char last = s.charAt(0);
    int c = 1;
    int res = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == last) {
        c++;
      } else {
        c--;
      }
      if (c == 0) {
        res++;
      }
    }
    return res;
  }
}