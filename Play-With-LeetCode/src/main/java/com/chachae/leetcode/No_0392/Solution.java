package com.chachae.leetcode.No_0392;

/**
 * https://leetcode-cn.com/problems/is-subsequence/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean isSubsequence(String s, String t) {
    if (s == null || s.equals("")) {
      return true;
    }
    char[] chars = t.toCharArray();
    int c = 0;
    for (char aChar : chars) {
      if (aChar == s.charAt(c)) {
        c++;
      }
      if (s.length() == c) {
        return true;
      }
    }
    return s.length() == c;
  }
}