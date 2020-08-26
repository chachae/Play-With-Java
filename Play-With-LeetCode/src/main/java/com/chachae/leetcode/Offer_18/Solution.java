package com.chachae.leetcode.Offer_18;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public ListNode deleteNode(ListNode head, int val) {

    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode cur = dummyHead;
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
        break;
      } else {
        cur = cur.next;
      }
    }
    return dummyHead.next;
  }
}