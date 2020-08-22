package com.chachae.leetcode.interview.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/permutation-i-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 23:58
 */
public class Interview_08_07 {

  /**
   * 输入：S = "qwe" 输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
   */

  private final List<String> record = new ArrayList<>();

  public String[] permutation(String S) {
    if (S == null || S.equals("")) {
      return new String[1];
    }
    backtrack(S, new StringBuilder(""));
    String[] res = new String[record.size()];
    return record.toArray(res);
  }

  private void backtrack(String s, StringBuilder cur) {
    if (s.length() == cur.length()) {
      record.add(cur.toString());
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      if (!cur.toString().contains(s.charAt(i) + "")) {
        cur.append(s.charAt(i));
        backtrack(s, cur);
        cur.deleteCharAt(cur.length() - 1);
      }
    }
  }
}
