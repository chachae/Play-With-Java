package com.chachae.algorithm.imooc.stack_and_queue;

import com.chachae.algorithm.imooc.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/ - 迭代解法（模拟系统栈）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 11:02
 */
public class BinaryTreePreorderTraversal_2 {

  public List<Integer> preorderTraversal(TreeNode root) {
    if (root == null) {
      return new ArrayList<>(1);
    }
    Stack<TreeNode> record = new Stack<>();
    List<Integer> res = new ArrayList<>();
    record.add(root);
    while (!record.isEmpty()) {
      TreeNode node = record.pop();
      res.add(node.val);
      if (node.right != null) {
        record.add(node.right);
      }
      if (node.left != null) {
        record.add(node.left);
      }
    }
    return res;
  }
}
