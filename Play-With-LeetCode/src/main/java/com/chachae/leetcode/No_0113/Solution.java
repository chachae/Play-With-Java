package com.chachae.leetcode.No_0113;

import com.chachae.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/path-sum-ii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private List<List<Integer>> ans;

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    ans = new LinkedList<>();
    dfs(root, sum, new ArrayList<>());
    return ans;
  }

  private void dfs(TreeNode root, int sum, List<Integer> path) {

    if (root == null) {
      return;
    }

    path.add(root.val);
    if (sum == root.val && root.left == null && root.right == null) {
      ans.add(new ArrayList<>(path));
    }

    dfs(root.left, sum - root.val, path);
    dfs(root.right, sum - root.val, path);
    path.remove(path.size() - 1);
  }
}