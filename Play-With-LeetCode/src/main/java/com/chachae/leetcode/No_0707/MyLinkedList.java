package com.chachae.leetcode.No_0707;

/**
 * https://leetcode-cn.com/problems/design-linked-list/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class MyLinkedList {

  private static class Node {

    public int val;
    public Node next;

    public Node() {
    }

    public Node(int val) {
      this.val = val;
    }
  }

  private final Node node;
  private int size;

  public MyLinkedList() {
    this.node = new Node(-1);
  }

  public int get(int index) {
    if (index >= size || index < 0) {
      return -1;
    }
    Node dummyHead = this.node;
    for (int i = 0; i <= index; i++) {
      dummyHead = dummyHead.next;
    }
    return dummyHead.val;
  }

  public void addAtHead(int val) {
    addAtIndex(0, val);
  }

  public void addAtTail(int val) {
    addAtIndex(size, val);
  }

  public void addAtIndex(int index, int val) {
    if (index > size) {
      return;
    }
    Node dummyHead = this.node;
    for (int i = 0; i < index; i++) {
      dummyHead = dummyHead.next;
    }
    Node cur = new Node(val);
    cur.next = dummyHead.next;
    dummyHead.next = cur;
    ++size;
  }

  public void deleteAtIndex(int index) {
    if (index >= size || index < 0) {
      return;
    }
    Node dummyHead = this.node;
    for (int i = 0; i < index; i++) {
      dummyHead = dummyHead.next;
    }
    dummyHead.next = dummyHead.next.next;
    --size;
  }
}
