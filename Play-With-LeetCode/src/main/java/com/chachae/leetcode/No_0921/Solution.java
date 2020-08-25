package com.chachae.leetcode.No_0921;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int minAddToMakeValid(String s) {
    char[] chars = s.toCharArray();
    Stack<Character> record = new Stack<>();
    int res = 0;
    for (char e : chars) {
      if (e == '(') {
        record.add(e);
      } else {
        // e == ')'
        if (record.isEmpty()) {
          ++res;
        } else {
          record.pop();
        }
      }
    }

    if (!record.isEmpty()) {
      for (int i = 0; i < record.size(); i++) {
        ++res;
      }
    }

    return res;
  }
}