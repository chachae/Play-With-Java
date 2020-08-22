package com.chachae.algorithm.imooc.linked_list;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 18:03
 */
public class ReverseList {

  // null 1->2->3->4
  public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;

    while (cur != null){
      ListNode next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }
}
