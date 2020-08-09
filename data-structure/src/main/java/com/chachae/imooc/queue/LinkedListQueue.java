package com.chachae.imooc.queue;

/**
 * @author chachae
 * @since 2020/4/8 18:06
 */
public class LinkedListQueue<E> implements Queue<E> {

  private class Node {

    public E e;
    public Node next;

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

  private Node head, tail;
  private int size;

  public LinkedListQueue() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public int getSize() {
    return size;
  }


  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void enqueue(E e) {
    if (tail == null) {
      tail = new Node(e);
      head = tail;
    } else {
      tail.next = new Node(e);
      tail = tail.next;
    }
    size++;
  }

  @Override
  public E dequeue() {
    if (head == null) {
      throw new IllegalArgumentException("队列为空");
    }
    Node del = head;
    head = head.next;
    size--;
    return del.e;
  }

  @Override
  public E getFront() {
    if (tail == null) {
      throw new IllegalArgumentException("队列为空");
    }
    return tail.e;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("Queue: front ");

    Node cur = head;
    while (cur != null) {
      res.append(cur + "->");
      cur = cur.next;
    }
    res.append("NULL tail");
    return res.toString();
  }

  public static void main(String[] args) {

    LinkedListQueue<Integer> queue = new LinkedListQueue<>();
    for (int i = 0; i < 10; i++) {
      queue.enqueue(i);
      System.out.println(queue);

      if (i % 3 == 2) {
        queue.dequeue();
        System.out.println(queue);
      }
    }
  }
}
