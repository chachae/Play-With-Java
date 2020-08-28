package com.chachae.leetcode.Interview_0203;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:10
 */
class Solution {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}