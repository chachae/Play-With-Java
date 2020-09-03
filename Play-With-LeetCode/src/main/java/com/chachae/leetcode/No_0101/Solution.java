package com.chachae.leetcode.No_0101;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/symmetric-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return check(root.left, root.right);
  }

  private boolean check(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return true;
    }

    if (t1 == null || t2 == null) {
      return false;
    }

    if (t1.val == t2.val) {
      return check(t1.left, t2.right) && check(t1.right, t2.left);
    } else {
      return false;
    }
  }
}