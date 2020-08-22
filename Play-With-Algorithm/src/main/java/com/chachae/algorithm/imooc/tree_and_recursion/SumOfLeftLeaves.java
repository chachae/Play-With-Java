package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/sum-of-left-leaves/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 18:00
 */
public class SumOfLeftLeaves {

  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int res = 0;
    //判断节点是否是左叶子节点，如果是则将它的和累计起来
    if (root.left != null && root.left.left == null && root.left.right == null) {
      res += root.left.val;
    }
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
  }
}
