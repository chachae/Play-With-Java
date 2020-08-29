package com.chachae.leetcode.No_1252;

/**
 * https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int oddCells(int n, int m, int[][] indices) {
    int[][] record = new int[n][m];
    for (int[] index : indices) {
      insert(record, index, n, m);
    }

    int count = 0;

    for (int[] ints : record) {
      for (int e : ints) {
        if (e % 2 != 0) {
          ++count;
        }
      }
    }
    return count;
  }

  private void insert(int[][] res, int[] index, int n, int m) {
    for (int i = 0; i < m; i++) {
      ++res[index[0]][i];
    }
    for (int i = 0; i < n; i++) {
      ++res[i][index[1]];
    }
  }
}