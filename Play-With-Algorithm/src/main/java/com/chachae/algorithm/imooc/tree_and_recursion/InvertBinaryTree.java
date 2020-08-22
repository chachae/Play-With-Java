package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 17:36
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    } else {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      root.left = invertTree(root.left);
      root.right = invertTree(root.right);
    }
    return root;
  }
}
