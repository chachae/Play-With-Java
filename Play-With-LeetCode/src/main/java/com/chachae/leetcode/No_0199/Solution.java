package com.chachae.leetcode.No_0199;

import com.chachae.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-right-side-view/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  List<Integer> ans = new ArrayList<>();

  public List<Integer> rightSideView(TreeNode root) {
    dfs(root, 0);
    return ans;
  }

  public void dfs(TreeNode root, int high) {
    if (root != null) {
      if (ans.size() <= high) {
        ans.add(root.val);
      }
      dfs(root.right, high + 1);
      dfs(root.left, high + 1);
    }
  }
}