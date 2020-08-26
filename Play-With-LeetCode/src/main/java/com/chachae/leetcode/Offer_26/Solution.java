package com.chachae.leetcode.Offer_26;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public boolean isSubStructure(TreeNode a, TreeNode b) {
    if (a == null || b == null) {
      return false;
    }
    return check(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
  }

  private boolean check(TreeNode a, TreeNode b) {
    if (b == null) {
      return true;
    }

    if (a == null) {
      return false;
    }

    return a.val == b.val && check(a.left, b.left) && check(a.right, b.right);
  }
}