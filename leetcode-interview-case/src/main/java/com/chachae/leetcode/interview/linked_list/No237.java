package com.chachae.leetcode.interview.linked_list;

import com.chachae.leetcode.interview.ListNode;

/**
 * <a href="https://leetcode-cn.com/problems/delete-node-in-a-linked-list/">237. 删除链表中的节点</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 20:03
 */
public class No237 {

  public static void main(String[] args) {
    ListNode node = new ListNode(4);
    ListNode node2 = new ListNode(5);
    ListNode node3 = new ListNode(1);
    ListNode node4 = new ListNode(9);
    node3.setNext(node4);
    node2.setNext(node3);
    node.setNext(node2);
    new No237().deleteNode(node);
  }

  public void deleteNode(ListNode node) {
    // 因为无法访问前一个结点，所以可以把要删除的结点的后一个结点的值前移
    node.val = node.next.val;
    // 然后删除掉后一个结点
    node.next = node.next.next;
  }
}
