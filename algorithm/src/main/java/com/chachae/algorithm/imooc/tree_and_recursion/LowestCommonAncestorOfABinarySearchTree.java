package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 11:55
 */
public class LowestCommonAncestorOfABinarySearchTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    if (p.val < root.val && q.val < root.val) {
      return lowestCommonAncestor(root.left, p, q);
    } else if (p.val > root.val && q.val > root.val) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
  }
}
