package com.chachae.leetcode.No_0234;

import com.chachae.leetcode.util.ListNode;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean isPalindrome(ListNode head) {

    if (head == null || head.next == null) {
      return true;
    }

    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    slow = reverse(slow.next);

    while (slow != null) {
      if (slow.val != head.val) {
        return false;
      }

      head = head.next;
      slow = slow.next;
    }
    return true;
  }

  private ListNode reverse(ListNode node) {
    ListNode pre = null;
    ListNode cur = node;
    ListNode next;

    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }
}


