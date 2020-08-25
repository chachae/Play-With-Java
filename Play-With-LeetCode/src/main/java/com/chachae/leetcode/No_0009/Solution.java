package com.chachae.leetcode.No_0009;

/**
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    String str = String.valueOf(x);
    int len = str.length();
    int lastIndex = len - 1;
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.indexOf(lastIndex--)) {
        return false;
      }
    }
    return true;
  }
}