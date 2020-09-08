package com.chachae.leetcode.No_0077;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combinations/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private List<List<Integer>> ans;
  private boolean[] visited;

  public List<List<Integer>> combine(int n, int k) {
    ans = new LinkedList<>();
    visited = new boolean[n + 1];
    dfs(n, k, 1, new LinkedList<>());
    return ans;
  }

  private void dfs(int n, int k, int start, LinkedList<Integer> path) {

    if (path.size() == k) {
      ans.add(new ArrayList<>(path));
    }

    for (int i = start; i <= n - (k - path.size()) + 1; i++) {
      if (!visited[i]) {
        path.addLast(i);
        visited[i] = true;
        dfs(n, k, i + 1, path);
        path.removeLast();
        visited[i] = false;
      }
    }
  }
}