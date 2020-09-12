package com.chachae.leetcode.Offer_07;

import com.chachae.leetcode.util.TreeNode;
import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    int n = preorder.length;
    if (n == 0) {
      return null;
    }
    int rootVal = preorder[0], rootIndex = 0;
    for (int i = 0; i < n; i++) {
      if (inorder[i] == rootVal) {
        rootIndex = i;
        break;
      }
    }
    TreeNode root = new TreeNode(rootVal);
    root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
    root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

    return root;
  }
}