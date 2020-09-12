package com.chachae.leetcode.Interview_1712;

import com.chachae.leetcode.util.TreeNode;

class Solution {

  TreeNode temp = null;

  public void cal(TreeNode root) {
    if (root == null) {
      return;
    }
    convertBiNode(root.right);
    root.right = temp;
    temp = root;
    convertBiNode(root.left);
    root.left = null;
  }

  public TreeNode convertBiNode(TreeNode root) {
    cal(root);
    return temp;
  }
}