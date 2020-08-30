package com.chachae.leetcode.No_0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations-ii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private final List<List<Integer>> ans = new ArrayList<>();

  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    boolean[] visited = new boolean[nums.length];
    dfs(nums, new LinkedList<>(), visited);
    return ans;
  }

  private void dfs(int[] nums, LinkedList<Integer> path, boolean[] visited) {
    if (path.size() == nums.length) {
      ans.add(new ArrayList<>(path));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (!visited[i]) {
        if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
          continue;
        }
        visited[i] = true;
        path.addLast(nums[i]);
        dfs(nums, path, visited);
        visited[i] = false;
        path.removeLast();
      }
    }
  }
}