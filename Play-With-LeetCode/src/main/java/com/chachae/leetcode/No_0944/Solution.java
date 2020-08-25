package com.chachae.leetcode.No_0944;

/**
 * https://leetcode-cn.com/problems/delete-columns-to-make-sorted/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int minDeletionSize(String[] a) {
    int res = 0;
    for (int i = 0; i < a[0].length(); i++) {
      for (int j = 1; j < a.length; j++) {
        if (a[j - 1].charAt(i) > a[j].charAt(i)) {
          res++;
          break;
        }
      }
    }
    return res;
  }
}