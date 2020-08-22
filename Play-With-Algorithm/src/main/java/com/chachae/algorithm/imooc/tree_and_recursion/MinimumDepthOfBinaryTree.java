package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 16:38
 */
public class MinimumDepthOfBinaryTree {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    // null节点不参与比较
    if (root.left == null && root.right != null) {
      return 1 + minDepth(root.right);
    }
    // null节点不参与比较
    if (root.right == null && root.left != null) {
      return 1 + minDepth(root.left);
    }

    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
  }

}
