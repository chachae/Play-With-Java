package com.chachae.leetcode.No_0744;

/**
 * https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public char nextGreatestLetter(char[] letters, char target) {
    int l = 0;
    int r = letters.length - 1;
    while (l <= r) {
      int mid = l + ((r - l) >> 1);
      if (letters[mid] <= target) {
        l = mid + 1;
      } else {
        r = mid;
        if (letters[l] > target) {
          return letters[l];
        }
      }
    }
    return letters[0];
  }
}