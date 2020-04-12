package com.chachae.linked;

/**
 * @author chachae
 * @since 2020/4/8 11:37
 */
public class LinkedList<E> {

  private class Node {

    private E e;

    private Node next;

    public Node(E e, Node next) {
      this.e = e;
      this.next = next;
    }

    public Node(E e) {
      this(e, null);
    }

    public Node() {
      this(null, null);
    }

    @Override
    public String toString() {
      return e.toString();
    }
  }

  private Node dummyHead;

  private int size;

  public LinkedList() {
    dummyHead = new Node(null, null);
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(int index, E e) {

    if (index < 0 || index > size) {
      throw new IllegalArgumentException("索引非法");
    }

    Node prev = dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }

    Node newNode = new Node(e);
    newNode.next = prev.next;
    prev.next = newNode;
    size++;
  }

  public void addFirst(E e) {
    add(0, e);
  }

  public void addLast(E e) {
    add(size, e);
  }

  public E get(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("索引非法");
    }
    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur.e;
  }

  public E getFirst() {
    return get(0);
  }

  public E getLast() {
    return get(size - 1);
  }

  public void set(int index, E e) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("索引非法");
    }

    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    cur.e = e;
  }

  public E remove(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("索引非法");
    }
    Node prev = dummyHead;
    for (int i = 0; i < index; i++) {
      prev = prev.next;
    }
    Node del = prev.next;
    prev.next = del.next;
    del.next = null;
    size--;
    return del.e;
  }

  public E removeLast() {
    return remove(size - 1);
  }

  public E removeFirst() {
    return remove(0);
  }

  /**
   * 从链表中删除元素e
   */
  public void removeElement(E e) {

    Node prev = dummyHead;
    while (prev.next != null) {
      if (prev.next.e.equals(e)) {
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

  public boolean contains(E e) {
    Node cur = dummyHead.next;
    while (cur != null) {
      if (cur.e == e) {
        return true;
      }
      cur = cur.next;
    }
    return false;
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
    LinkedList<Integer> linkedList = new LinkedList<>();
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
