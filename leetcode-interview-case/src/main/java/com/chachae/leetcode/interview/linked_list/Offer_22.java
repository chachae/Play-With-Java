package com.chachae.leetcode.interview.linked_list;

import com.chachae.leetcode.interview.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/">剑指
 * Offer
 * 22. 链表中倒数第k个节点</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 20:22
 */
public class Offer_22 {

  public static void main(String[] args) {

  }

  public ListNode getKthFromEnd(ListNode head, int k) {
    int step = 0;
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null) {
      if (step >= k) {
        slow = slow.next;
      }
      step++;
      fast = fast.next;
    }
    return slow;
  }
}
