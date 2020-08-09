package com.chachae.leetcode.interview.linked_list;

import com.chachae.leetcode.interview.ListNode;

/**
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/comments/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 20:19
 */
public class Interview_02_03 {

  public static void main(String[] args) {

  }

  public int kthToLast(ListNode head, int k) {
    int step = 0;
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null) {
      if (step >= k) {
        slow = slow.next;
      }
      fast = fast.next;
      step++;
    }
    return slow.val;
  }

}
