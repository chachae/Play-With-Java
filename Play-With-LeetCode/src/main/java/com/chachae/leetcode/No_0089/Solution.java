package com.chachae.leetcode.No_0089;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/gray-code/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    System.out.println(1 << 0);
    System.out.println(1 << 1);
    System.out.println(1 << 2);
    System.out.println(1 << 3);
    System.out.println(1 << 4);
    System.out.println(1 << 5);
    System.out.println(3 ^ 1);
  }

  private final List<Integer> res = new ArrayList<>();
  private boolean[] visited;

  public List<Integer> grayCode(int n) {
    // 可以产生的组合数量（1<<n）
    visited = new boolean[1 << n];
    dfs(0, n);
    return res;
  }

  boolean dfs(int cur, int n) {
    if (res.size() == 1 << n) {
      return true;
    }
    res.add(cur);
    visited[cur] = true;
    for (int i = 0; i < n; i++) {
      int next = cur ^ (1 << i);
      if (!visited[next] && dfs(next, n)) {
        return true;
      }
    }
    visited[cur] = false;
    return false;
  }
}