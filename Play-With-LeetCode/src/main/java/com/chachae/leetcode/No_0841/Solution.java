package com.chachae.leetcode.No_0841;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/keys-and-rooms/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    visited[0] = true;
    dfs(rooms, rooms.get(0), visited);
    boolean result = true;
    for (boolean b : visited) {
      result &= b;
    }
    return result;
  }

  private void dfs(List<List<Integer>> rooms, List<Integer> keys, boolean[] visited) {
    for (int key : keys) {
      if (!visited[key]) {
        visited[key] = true;
        dfs(rooms, rooms.get(key), visited);
      }
    }
  }
}
