package com.chachae.leetcode.No_0637;

import com.chachae.leetcode.util.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> ans = new LinkedList<>();
    Queue<TreeNode> deepList = new LinkedList<>();
    deepList.add(root);
    while (!deepList.isEmpty()) {
      int len = deepList.size();
      double sum = 0;
      for (int i = 0; i < len; i++) {
        TreeNode node = deepList.poll();
        assert node != null;
        sum += node.val;
        if (node.left != null) {
          deepList.add(node.left);
        }
        if (node.right != null) {
          deepList.add(node.right);
        }
      }
      ans.add(sum / len);
    }
    return ans;
  }
}