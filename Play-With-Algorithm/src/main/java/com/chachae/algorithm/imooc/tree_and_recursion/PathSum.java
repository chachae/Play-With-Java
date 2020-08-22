package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/path-sum/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 17:49
 */
public class PathSum {

  public boolean hasPathSum(TreeNode root, int sum) {

    if (root == null) {
      return false;
    }

    if (root.left == null && root.right == null) {
      return root.val == sum;
    }

    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
  }
}
