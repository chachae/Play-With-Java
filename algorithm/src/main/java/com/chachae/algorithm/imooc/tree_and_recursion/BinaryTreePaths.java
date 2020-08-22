package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-paths/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 11:13
 */
public class BinaryTreePaths {

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    buildPath(root, res, "");
    return res;
  }

  private void buildPath(TreeNode root, List<String> res, String currentPath) {
    if (root == null) {
      return;
    }
    currentPath += root.val;
    if (root.left == null && root.right == null) {
      res.add(currentPath);
    } else {
      buildPath(root.left, res, currentPath + "->");
      buildPath(root.right, res, currentPath + "->");
    }
  }
}