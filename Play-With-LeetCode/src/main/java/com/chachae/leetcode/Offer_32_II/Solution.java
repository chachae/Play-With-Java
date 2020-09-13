package com.chachae.leetcode.Offer_32_II;

import com.chachae.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  List<List<Integer>> ans = new LinkedList<>();

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return ans;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> curLevel = new LinkedList<>();
      while (--size >= 0) {
        TreeNode cur = queue.poll();
        curLevel.add(cur.val);
        if (cur.left != null) {
          queue.add(cur.left);
        }
        if (cur.right != null) {
          queue.add(cur.right);
        }
      }
      ans.add(curLevel);
    }
    return ans;
  }
}