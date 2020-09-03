package com.chachae.leetcode.No_0297;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
public class Codec {

  private TreeNode root;

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    this.root = root;
    return null;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    return this.root;
  }
}