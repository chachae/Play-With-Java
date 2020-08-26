package com.chachae.leetcode.Offer_50;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public char firstUniqChar(String s) {
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      //首次出现的位置是当前位置，且后面没有再出现这个字符
      if (s.indexOf(ch) == i && s.indexOf(ch, i + 1) == -1) {
        return s.charAt(i);
      }
    }
    return ' ';
  }
}