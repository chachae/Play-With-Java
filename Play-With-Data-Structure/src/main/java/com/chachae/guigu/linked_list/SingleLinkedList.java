package com.chachae.guigu.linked_list;

/**
 * 单链表
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 15:38
 */
public class SingleLinkedList<E> {

  private class Node {

    public E element;
    public Node next;

    public Node(E element, Node next) {
      this.element = element;
      this.next = next;
    }

    public Node(E element) {
      this(element, null);
    }

    public Node() {
      this(null, null);
    }

    @Override
    public String toString() {
      return element.toString();
    }
  }

  private final Node dummyHead;
  private int size;

  public SingleLinkedList() {
    this.dummyHead = new Node(null, null);
    this.size = 0;
  }

  public void add(int index, E e) {
    isErrIndex(index);
    Node prev = this.dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node addNode = new Node(e);
    addNode.next = prev.next;
    prev.next = addNode;
    size++;
  }

  public void addFirst(E e) {
    add(0, e);
  }

  public void addLast(E e) {
    add(size - 1, e);
  }

  public void remove(int index) {
    isErrIndex(index);
    Node prev = this.dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node delNode = prev.next;
    prev.next = delNode.next;
    size--;
  }

  public void removeFirst() {
    remove(0);
  }

  public void removeLast() {
    remove(size - 1);
  }

  public void set(int index, E e) {
    isErrIndex(index);
    Node prev = this.dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    prev.next.element = e;
  }

  public boolean contains(E e) {
    Node cur = dummyHead.next;
    while (cur != null) {
      if (cur.element == e) {
        return true;
      }
      cur = cur.next;
    }
    return false;
  }

  private void isErrIndex(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("索引非法");
    }
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    Node cur = dummyHead.next;
    while (cur != null) {
      res.append(cur).append("->");
      cur = cur.next;
    }
    res.append("NULL");
    return res.toString();
  }

  public static void main(String[] args) {
    SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
    for (int i = 0; i < 5; i++) {
      linkedList.addFirst(i);
      System.out.println(linkedList);
    }

    linkedList.add(2, 666);
    System.out.println(linkedList);

    linkedList.remove(2);
    System.out.println(linkedList);

    linkedList.removeFirst();
    System.out.println(linkedList);

    linkedList.removeLast();
    System.out.println(linkedList);
  }

}
