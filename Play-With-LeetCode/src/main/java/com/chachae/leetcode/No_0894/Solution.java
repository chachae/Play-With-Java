package com.chachae.leetcode.No_0894;

import com.chachae.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/all-possible-full-binary-trees/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<TreeNode> allPossibleFBT(int n) {
    List<TreeNode> ans = new ArrayList<>();
    if (n % 2 == 0) {
      return ans;
    }

    if (n == 1) {
      ans.add(new TreeNode(0));
      return ans;
    }

    for (int i = 1; i < n; i += 2) {
      List<TreeNode> left = allPossibleFBT(i);
      List<TreeNode> right = allPossibleFBT(n - 1 - i);
      for (TreeNode l : left) {
        for (TreeNode r : right) {
          TreeNode head = new TreeNode(0);
          head.left = l;
          head.right = r;
          ans.add(head);
        }
      }
    }
    return ans;
  }
}