package com.chachae.leetcode.Offer_05;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public String replaceSpace(String s) {
    StringBuilder res = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        res.append("%20");
      } else {
        res.append(c);
      }
    }
    return res.toString();
  }
}