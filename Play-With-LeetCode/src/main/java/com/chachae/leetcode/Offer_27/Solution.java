package com.chachae.leetcode.Offer_27;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public TreeNode mirrorTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    buildMirror(root);
    return root;
  }

  private void buildMirror(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    buildMirror(root.left);
    buildMirror(root.right);
  }
}