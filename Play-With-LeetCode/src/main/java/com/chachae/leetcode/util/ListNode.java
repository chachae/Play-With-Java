package com.chachae.leetcode.util;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 11:42
 */
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
