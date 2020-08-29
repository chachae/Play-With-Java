package com.chachae.leetcode.No_1351;

/**
 * https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int countNegatives(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    int ans = 0;
    int i = 0, j = n - 1;
    while (i < m && j >= 0) {
      if (grid[i][j] < 0) {
        ans += (m - i);
        j--;
      } else {
        i++;
      }
    }
    return ans;
  }
}
