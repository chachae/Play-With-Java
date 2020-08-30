package com.chachae.leetcode.No_0557;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public String reverseWords(String s) {
    if (s == null) {
      return null;
    }
    String[] arr = s.trim().split(" ");
    for (int i = 0; i < arr.length; i++) {
      char[] chs = arr[i].toCharArray();
      int end = chs.length;
      for (int j = 0; j < end / 2; j++) {
        char temp = chs[j];
        chs[j] = chs[end - 1 - j];
        chs[end - 1 - j] = temp;
      }
      arr[i] = new String(chs);
    }
    return String.join(" ", arr);
  }
}