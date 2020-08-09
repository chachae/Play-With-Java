package com.chachae.leetcode.interview.linked_list;

import com.chachae.leetcode.interview.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/">剑指 Offer 24. 反转链表</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 20:25
 */
public class Offer_24 {

  public static void main(String[] args) {

  }

  public ListNode reverseList(ListNode head) {
    ListNode pre = null, cur = head, next;
    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }
}
