package com.chachae.algorithm.imooc.recursion_and_recall;

/**
 * https://leetcode-cn.com/problems/word-search/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 18:23
 */
public class ProblemsWordSearch {

  public boolean exist(char[][] board, String word) {
    boolean[][] visited = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0)) {
          // 不能直接return，因为可能第一遍不通
          if (dfs(board, word, visited, i, j, 0)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
    if (index == word.length()) {
      return true;
    }
    if (i < 0 || j < 0 || i == board.length || j == board[0].length || visited[i][j]) {
      return false;
    }
    if (board[i][j] == word.charAt(index)) {
      visited[i][j] = true;
      boolean res = dfs(board, word, visited, i + 1, j, index + 1) ||
          dfs(board, word, visited, i - 1, j, index + 1) ||
          dfs(board, word, visited, i, j + 1, index + 1) ||
          dfs(board, word, visited, i, j - 1, index + 1);
      visited[i][j] = false;
      return res;
    }
    return false;
  }
}
