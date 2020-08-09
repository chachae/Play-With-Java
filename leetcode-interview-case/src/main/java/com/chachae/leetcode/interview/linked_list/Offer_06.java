package com.chachae.leetcode.interview.linked_list;

import com.chachae.leetcode.interview.ListNode;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 21:07
 */
public class Offer_06 {

  public int[] reversePrint(ListNode head) {
    ListNode cur = head;
    int size = 0;
    while (cur != null) {
      size++;
      cur = cur.next;
    }
    int[] res = new int[size];
    cur = head;
    for (int i = size - 1; i >= 0; i--) {
      res[i] = cur.val;
      cur = cur.next;
    }
    return res;
  }
}
