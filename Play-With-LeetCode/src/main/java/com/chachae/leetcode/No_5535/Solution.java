package com.chachae.leetcode.No_5535;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author chachae
 * @date 2020/10/11 15:24
 * @version v1.0
 */
class Solution {

  public int maxDepth(String s) {
    int ans = 0;
    Queue<Character> records = new LinkedList<>();
    char[] chs = s.toCharArray();
    for (char e : chs) {
      if (e == '(') {
        records.offer(e);
      } else if (e == ')') {
        ans = Math.max(records.size(), ans);
        records.poll();
      }
    }
    return ans;
  }
}