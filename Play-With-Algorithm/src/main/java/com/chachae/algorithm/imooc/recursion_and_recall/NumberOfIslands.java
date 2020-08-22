package com.chachae.algorithm.imooc.recursion_and_recall;

/**
 * https://leetcode-cn.com/problems/number-of-islands/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 21:46
 */
public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    int res = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          res++;
          dfs(grid, i, j);
        }
      }
    }
    return res;
  }

  private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == '0') {
      return;
    }
    grid[i][j] = '0';
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }
}
