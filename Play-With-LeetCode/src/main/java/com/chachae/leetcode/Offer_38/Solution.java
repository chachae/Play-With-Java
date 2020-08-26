package com.chachae.leetcode.Offer_38;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  List<String> res = new LinkedList<>();
  char[] c;

  public String[] permutation(String s) {
    c = s.toCharArray();
    dfs(0);
    return res.toArray(new String[0]);
  }

  void dfs(int x) {
    if (x == c.length - 1) {
      res.add(String.valueOf(c));
      return;
    }
    HashSet<Character> set = new HashSet<>();
    for (int i = x; i < c.length; i++) {
      if (set.contains(c[i])) {
        continue;
      }
      set.add(c[i]);
      swap(i, x);
      dfs(x + 1);
      swap(x, i);
    }
  }

  void swap(int i, int j) {
    char temp = c[i];
    c[i] = c[j];
    c[j] = temp;
  }
}