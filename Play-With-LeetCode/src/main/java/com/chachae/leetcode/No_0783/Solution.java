package com.chachae.leetcode.No_0783;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private TreeNode pre = null;
  private int res = Integer.MAX_VALUE;

  public int minDiffInBST(TreeNode root) {
    dfs(root);
    return res;
  }

  private void dfs(TreeNode root) {
    if (root == null) {
      return;
    }

    dfs(root.left);
    if (pre != null) {
      res = Math.min(root.val - pre.val, res);
    }
    pre = root;
    dfs(root.right);
  }
}