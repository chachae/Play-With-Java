package com.chachae.leetcode.Offer_28;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public boolean isSymmetric(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return true;
    }
    if (root.left == null || root.right == null || root.left.val != root.right.val) {
      return false;
    }
    return check(root.left, root.right);
  }

  private boolean check(TreeNode t1, TreeNode t2) {
    if (t1 == null) {
      return t2 == null;
    }

    if (t2 == null || t1.val != t2.val) {
      return false;
    }

    return check(t1.left, t2.right) && check(t1.right, t2.left);
  }
}