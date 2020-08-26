package com.chachae.leetcode.No_0021;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  /**
   * 输入：4, 4 输出：1->1->2->3->4->4 cur : 1 2 3 4
   */

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
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
    cur.next = l1 == null ? l2 : l1;
    return dummy.next;
  }
}