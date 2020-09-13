package com.chachae.leetcode.No_0079;

/**
 * https://leetcode-cn.com/problems/word-search/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private boolean[][] visited;

  public boolean exist(char[][] board, String word) {

    int w = board.length;
    int h = board[0].length;
    visited = new boolean[w][h];

    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (board[i][j] == word.charAt(0)) {
          boolean ans = dfs(board, word, i, j, 0);
          if (ans) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, String word, int i, int j, int index) {
    if (index == word.length()) {
      return true;
    }

    if (i < 0 || j < 0 || i == board.length || j == board[0].length || visited[i][j]) {
      return false;
    }

    if (board[i][j] == word.charAt(index)) {
      visited[i][j] = true;
      boolean ans = dfs(board, word, i + 1, j, index + 1) || dfs(board, word, i - 1, j, index + 1) || dfs(board, word, i, j + 1, index + 1) || dfs(board, word, i, j - 1, index + 1);
      visited[i][j] = false;
      return ans;
    }
    return false;
  }
}