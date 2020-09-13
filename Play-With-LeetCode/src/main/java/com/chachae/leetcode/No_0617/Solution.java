package com.chachae.leetcode.No_0617;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null) {
      return t2;
    }

    if (t2 == null) {
      return t1;
    }

    t1.val += t2.val;
    t1.left = mergeTrees(t1.left, t2.left);
    t1.right = mergeTrees(t1.right, t2.right);
    return t1;
  }
}