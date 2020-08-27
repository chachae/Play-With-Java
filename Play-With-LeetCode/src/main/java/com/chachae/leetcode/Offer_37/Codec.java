package com.chachae.leetcode.Offer_37;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Codec {

  private TreeNode treeNode;

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    this.treeNode = root;
    return null;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    return this.treeNode;
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));