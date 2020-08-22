package com.chachae.algorithm.imooc.stack_and_queue;

import com.chachae.algorithm.imooc.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 11:25
 */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> fs = new ArrayList<>();
      while (size != 0) {
        TreeNode node = queue.poll();
        fs.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        size--;
      }
      res.add(fs);
    }
    return res;
  }
}
