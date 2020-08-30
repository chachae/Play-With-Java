package com.chachae.leetcode.No_0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combination-sum-ii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<List<Integer>> ans = new ArrayList<>();

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // candidates = [10,1,2,7,6,1,5], target = 8,
    // [1,1,2,5,6,7,10]
    Arrays.sort(candidates);
    boolean[] visited = new boolean[candidates.length];
    dfs(candidates, target, 0, visited, new LinkedList<>());
    return ans;
  }

  private void dfs(int[] candidates, int target, int start, boolean[] visited, LinkedList<Integer> path) {
    if (target == 0) {
      ans.add(new ArrayList<>(path));
      return;
    }

    if (target > 0) {
      for (int i = start; i < candidates.length; i++) {
        if (candidates[i] <= target && !visited[i]) {
          //如果以当前结点为头结点的所有组合都找完了，那么下一个与他他相同的头结点就不用去找了。(去重)
          if (i > start && candidates[i] == candidates[i - 1]) {
            continue;
          }
          visited[i] = true;
          path.addLast(candidates[i]);
          dfs(candidates, target - candidates[i], i + 1, visited, path);
          visited[i] = false;
          path.removeLast();
        }
      }
    }
  }
}