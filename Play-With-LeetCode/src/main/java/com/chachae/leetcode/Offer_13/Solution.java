package com.chachae.leetcode.Offer_13;

/**
 * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int movingCount(int m, int n, int k) {
    boolean[][] visited = new boolean[m][n];
    return dfs(0, 0, m, n, k, visited);
  }

  private int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {

    if (i < 0 || i >= m || j < 0 || j >= n || (i / 10 + i % 10 + j / 10 + j % 10) > k || visited[i][j]) {
      return 0;
    }
    visited[i][j] = true;
    return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) +
        dfs(i, j + 1, m, n, k, visited) + dfs(i, j - 1, m, n, k, visited) + 1;
  }

}