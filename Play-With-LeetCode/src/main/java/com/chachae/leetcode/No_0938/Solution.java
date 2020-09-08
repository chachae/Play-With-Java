package com.chachae.leetcode.No_0938;

import com.chachae.leetcode.util.TreeNode;

/**
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private int ans = 0;

  public int rangeSumBST(TreeNode root, int L, int R) {
    cal(root, L, R);
    return ans;
  }

  private void cal(TreeNode root, int L, int R) {
    if (root == null) {
      return;
    }
    if (root.val >= L && root.val <= R) {
      ans += root.val;
    }
    cal(root.left, L, R);
    cal(root.right, L, R);
  }
}