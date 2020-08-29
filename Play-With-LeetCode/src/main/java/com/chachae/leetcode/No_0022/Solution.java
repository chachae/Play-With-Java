package com.chachae.leetcode.No_0022;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<String> res = new ArrayList<>();

  public List<String> generateParenthesis(int n) {
    dfs(new StringBuilder(), 0, n, n);
    return res;
  }

  private void dfs(StringBuilder path, int index, int leftCnt, int rightCnt) {

    if (leftCnt == 0 && rightCnt == 0) {
      res.add(path.toString());
      return;
    }

    if (leftCnt > 0) {
      path.append('(');
      dfs(path, index + 1, leftCnt - 1, rightCnt);
      path.deleteCharAt(path.length() - 1);
    }

    if (rightCnt > 0 && leftCnt < rightCnt) {
      path.append(')');
      dfs(path, index + 1, leftCnt, rightCnt - 1);
      path.deleteCharAt(path.length() - 1);
    }
  }
}