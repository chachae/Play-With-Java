package com.chachae.leetcode.Offer_25;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  /**
   * 输入：1->2->4, 1->3->4 输出：1->1->2->3->4->4
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        cur.next = l1;
        l1 = l1.next;
      } else {
        cur.next = l2;
        l2 = l2.next;
      }
      cur = cur.next;
    }

    if (l1 == null) {
      cur.next = l2;
    } else {
      cur.next = l1;
    }
    return dummy.next;
  }
}