package com.chachae.leetcode.No_1021;

/**
 * https://leetcode-cn.com/problems/remove-outermost-parentheses/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public String removeOuterParentheses(String S) {
    int count = 0;
    boolean flag = false;
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '(') {
        if (flag) {
          res.append(S.charAt(i));
        }
        flag = true;
        count++;
      } else if (S.charAt(i) == ')') {
        if (count == 1) {
          flag = false;
        } else {
          res.append(S.charAt(i));
        }
        count--;
      }
    }
    return res.toString();
  }
}