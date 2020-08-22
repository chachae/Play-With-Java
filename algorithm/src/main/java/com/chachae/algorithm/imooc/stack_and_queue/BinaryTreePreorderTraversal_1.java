package com.chachae.algorithm.imooc.stack_and_queue;

import com.chachae.algorithm.imooc.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/ - 递归解法
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 10:45
 */
public class BinaryTreePreorderTraversal_1 {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    preorder(root, res);
    return res;
  }

  private void preorder(TreeNode root, List<Integer> res) {
    if (root != null) {
      res.add(root.val);
      preorder(root.left, res);
      preorder(root.right, res);
    }
  }
}
