package com.chachae.leetcode.No_1528;

/**
 * https://leetcode-cn.com/problems/shuffle-string/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public String restoreString(String s, int[] indices) {
    char[] chs = new char[s.length()];
    for (int i = 0; i < indices.length; i++) {
      chs[indices[i]] = s.charAt(i);
    }

    return new String(chs);
  }
}