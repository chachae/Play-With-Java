package com.chachae.algorithm.imooc.tree_and_recursion;

import com.chachae.algorithm.imooc.TreeNode;

/**
 * https://leetcode-cn.com/problems/path-sum-iii/ 双重递归 思路：首先先序递归遍历每个节点，再以每个节点作为起始点递归寻找满足条件的路径。
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 11:40
 */
public class PathSum_iii {

  private int pathNum = 0;

  public int pathSum(TreeNode root, int sum) {
    if (root == null) {
      return 0;
    }
    calPathNum(root, sum);
    pathSum(root.left, sum);
    pathSum(root.right, sum);
    return pathNum;
  }

  private void calPathNum(TreeNode root, int sum) {
    if (root == null) {
      return;
    }
    sum -= root.val;
    if (sum == 0) {
      pathNum++;
    }
    calPathNum(root.left, sum);
    calPathNum(root.right, sum);
  }
}
