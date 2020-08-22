package com.chachae.algorithm.imooc.stack_and_queue;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 11:53
 */
public class MaxDepth {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return calDeep(root,0);
  }

  private int calDeep(TreeNode root, int deep) {
    if (root != null) {
      return Math.max(calDeep(root.left, ++deep),calDeep(root.right, deep));
    }
    return deep;
  }
}
