package com.chachae.leetcode.No_0784;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/letter-case-permutation/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<String> res = new ArrayList<>();
  int dis = 'A' - 'a';

  public List<String> letterCasePermutation(String S) {
    if (S.length() == 0) {
      return res;
    }
    char[] cs = S.toCharArray();
    helper(cs, 0);
    return res;
  }

  public void helper(char[] cs, int idx) {
    res.add(String.valueOf(cs));
    for (int i = idx; i < cs.length; i++) {
      if (cs[i] >= '0' && cs[i] <= '9') {
        continue;
      } else if (cs[i] >= 'a' && cs[i] <= 'z') {
        cs[i] = (char) (cs[i] + dis);
        helper(cs, i + 1);
        cs[i] = (char) (cs[i] - dis);
      } else {
        cs[i] = (char) (cs[i] - dis);
        helper(cs, i + 1);
        cs[i] = (char) (cs[i] + dis);
      }
    }
  }
}