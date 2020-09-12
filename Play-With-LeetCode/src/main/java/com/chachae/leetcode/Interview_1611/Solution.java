package com.chachae.leetcode.Interview_1611;

class Solution {

  public int[] divingBoard(int shorter, int longer, int k) {
    if (k == 0) {
      return new int[]{};
    }
    if (shorter == longer) {
      return new int[]{shorter * k};
    }
    int[] result = new int[k + 1];
    int start = shorter * k;
    for (int i = 0; i <= k; i++) {
      result[i] = start + (longer - shorter) * i;
    }
    return result;
  }
}