package com.chachae.leetcode.No_0709;

/**
 * https://leetcode-cn.com/problems/to-lower-case/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    new Solution().toLowerCase("A");
  }

  public String toLowerCase(String str) {
    StringBuilder sb = new StringBuilder();
    char[] chs = str.toCharArray();
    for (char ch : chs) {
      if (ch >= 'A' && ch <= 'Z') {
        sb.append((char) (ch + 32));
      } else {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}