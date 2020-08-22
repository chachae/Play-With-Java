package com.chachae.algorithm.imooc.linked_list;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 21:01
 */
public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    int len = 0;
    ListNode cur = head;
    while (cur != null) {
      len++;
      cur = cur.next;
    }

    if (n == len) {
      if (n <= 1) {
        return null;
      } else {
        return head.next;
      }
    }

    cur = head;
    int delPoint = len - n;
    for (int i = 0; i < delPoint - 1; i++) {
      cur = cur.next;
    }
    cur.next = cur.next.next;
    return head;
  }
}
