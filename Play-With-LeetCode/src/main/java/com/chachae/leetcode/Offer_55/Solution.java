package com.chachae.leetcode.Offer_55;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int maxDepth(TreeNode root) {
    return cal(root, 0);
  }

  private int cal(TreeNode root, int deep) {
    if (root == null) {
      return deep;
    }
    return Math.max(cal(root.left, ++deep), cal(root.right, deep));
  }
}