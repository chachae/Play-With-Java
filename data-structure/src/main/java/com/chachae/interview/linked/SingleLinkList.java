package com.chachae.interview.linked;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 22:04
 */
public class SingleLinkList<E> {

  private Node dummy;

  private int size;

  public SingleLinkList() {
    this.size = 0;
    this.dummy = new Node(null);
  }

  private class Node {

    private E data;
    private Node next;

    public Node(E obj) {
      this.data = obj;
    }
  }

  public void add(E e) {
    Node prev = this.dummy;
    Node newNode = new Node(e);
    newNode.next = prev.next;
    prev.next = newNode;
  }

  public void delete(E e) {

    Node prev = this.dummy;

    while (prev.next != null) {
      if (prev.next.data == e) {
        break;
      }
      prev = prev.next;
    }

    if (prev.next != null) {
      Node delNode = prev.next;
      prev.next = delNode.next;
      delNode.next = null;
      size--;
    }

  }

  public static void main(String[] args) {
    SingleLinkList<Integer> linkedList = new SingleLinkList<>();
    for (int i = 0; i < 5; i++) {
      linkedList.add(i);
      System.out.println(linkedList);
    }

    linkedList.delete(2);
    System.out.println(linkedList);
  }

}
