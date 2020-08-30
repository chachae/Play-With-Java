package com.chachae.leetcode.No_0060;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutation-sequence/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<String> paths = new ArrayList<>();

  public String getPermutation(int n, int k) {
    int[] t = new int[n];
    int s = 1;
    for (int i = 0; i < n; i++) {
      t[i] = s++;
    }
    boolean[] visited = new boolean[t.length];
    dfs(t, 0, new StringBuilder(), visited, k);
    return paths.get(k - 1);
  }

  private void dfs(int[] t, int start, StringBuilder sb, boolean[] visited, int k) {

    if (sb.length() == t.length && paths.size() <= k) {
      paths.add(sb.toString());
      return;
    }

    for (int i = 0; i < t.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        sb.append(t[i]);
        dfs(t, start + 1, sb, visited, k);
        visited[i] = false;
        sb.deleteCharAt(sb.length() - 1);
      }
    }
  }
}