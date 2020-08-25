package com.chachae.leetcode.No_0491;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/increasing-subsequences/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<List<Integer>> findSubsequences(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    dfs(nums, 0, path, res);
    return res;
  }


  private void dfs(int[] nums, int indexOfStart, LinkedList<Integer> path, List<List<Integer>> res) {
    if (path.size() >= 2) {
      res.add(new ArrayList<>(path));
    }

    List<Integer> record = new ArrayList<>();

    for (int i = indexOfStart; i < nums.length; i++) {
      if ((path.isEmpty() || path.getLast() <= nums[i]) && !record.contains(nums[i])) {
        path.addLast(nums[i]);
        record.add(nums[i]);
        dfs(nums, i + 1, path, res);
        path.removeLast();
      }
    }
  }
}