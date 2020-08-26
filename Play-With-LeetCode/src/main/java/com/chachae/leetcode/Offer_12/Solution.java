package com.chachae.leetcode.Offer_12;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public boolean exist(char[][] board, String word) {
    if (board == null || board[0] == null || board.length == 0 || board[0].length == 0 || word == null || word.equals("")) {
      return false;
    }
    boolean[][] isVisited = new boolean[board.length][board[0].length];
    char[] chs = word.toCharArray();

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == chs[0]) {
          if (dfs(board, i, j, isVisited, chs, 0)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, int i, int j, boolean[][] isVisited, char[] chs, int index) {

    if (index == chs.length) {
      return true;
    }
    if (i < 0 || j < 0 || i == board.length || j == board[0].length || isVisited[i][j] || board[i][j] != chs[index]) {
      return false;
    }
    isVisited[i][j] = true;
    boolean res = dfs(board, i + 1, j, isVisited, chs, index + 1)
        || dfs(board, i - 1, j, isVisited, chs, index + 1)
        || dfs(board, i, j + 1, isVisited, chs, index + 1)
        || dfs(board, i, j - 1, isVisited, chs, index + 1);
    isVisited[i][j] = false;
    return res;
  }
}