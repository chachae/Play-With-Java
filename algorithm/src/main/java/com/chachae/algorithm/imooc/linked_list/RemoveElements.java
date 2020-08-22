package com.chachae.algorithm.imooc.linked_list;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 18:49
 */
public class RemoveElements {

  public ListNode removeElements(ListNode head, int val) {
    ListNode header = new ListNode(0);
    header.next = head;
    ListNode cur = header;
    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    return header.next;
  }
}
