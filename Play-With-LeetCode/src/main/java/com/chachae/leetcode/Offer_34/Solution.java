package com.chachae.leetcode.Offer_34;

import com.chachae.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  private List<List<Integer>> res;

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    res = new ArrayList<>();
    backtrack(root, sum, new LinkedList<>());
    return res;
  }

  private void backtrack(TreeNode root, int sum, LinkedList<Integer> path) {
    if (root == null) {
      return;
    }
    path.addLast(root.val);
    sum -= root.val;
    if (sum == 0 && root.left == null && root.right == null) {
      res.add(new ArrayList<>(path));
    } else {
      backtrack(root.left, sum, path);
      backtrack(root.right, sum, path);
    }
    path.removeLast();
  }
}