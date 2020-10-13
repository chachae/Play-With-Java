package com.chachae.leetcode.No_0024;

import com.chachae.leetcode.util.ListNode;

/**
 *
 * @author chachae
 * @date 2020/10/13 16:16
 * @version v1.0
 */
class Solution {

  public ListNode swapPairs(ListNode head) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode cur = dummyHead;
    while (cur.next != null && cur.next.next != null) {
      ListNode node1 = cur.next;
      ListNode node2 = cur.next.next;
      ListNode next = node2.next;
      cur.next = node2;
      node2.next = node1;
      node1.next = next;
      cur = node1;
    }
    return dummyHead.next;
  }
}