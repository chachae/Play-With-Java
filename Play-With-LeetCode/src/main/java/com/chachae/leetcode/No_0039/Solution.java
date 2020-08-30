package com.chachae.leetcode.No_0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combination-sum/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<List<Integer>> res = new ArrayList<>();

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    dfs(candidates, target, new LinkedList<>(), 0);
    return res;
  }

  private void dfs(int[] candidates, int target, LinkedList<Integer> path, int start) {
    if (target == 0) {
      res.add(new ArrayList<>(path));
      return;
    }
    if (target < candidates[0]) {
      return;
    }
    for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
      int candidate = candidates[i];
      path.add(candidate);
      dfs(candidates, target - candidate, path, i);
    }
  }
}