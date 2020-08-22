package com.chachae.algorithm.imooc.linked_list;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/19 20:31
 */
public class SwapNodesInPairs {

  // 1->2->3->4->5

  // cur node1 node2    next
  // 0-> 1->      2->     3  -> 4
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
