package com.chachae.leetcode.No_0695;

/**
 * https://leetcode-cn.com/problems/max-area-of-island/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private int ans = 0;

  public int maxAreaOfIsland(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          ans = Math.max(dfs(grid, i, j), ans);
        }
      }
    }
    return ans;
  }

  private int dfs(int[][] grid, int i, int j) {
    if (i < 0 || j < 0 || i == grid.length || j == grid[0].length) {
      return 0;
    }
    if (grid[i][j] == 0) {
      return 0;
    }
    grid[i][j] = 0;
    return dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j + 1) + dfs(grid, i, j - 1) + 1;
  }
}