package com.chachae.interview.queue;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 21:18
 */
public class Queue<E> {

  private int size;

  private E[] els;

  private int front, rear, capacity;

  public Queue(int capacity) {
    this.capacity = capacity;
    this.front = this.rear = 0;
    this.els = (E[]) new Object[capacity];
    this.size = 0;
  }

  public Queue() {
    this(10);
  }

  public void add(E e) {
    isFull();
    this.size++;
    this.els[rear++] = e;
  }

  public E poll() {
    this.size--;
    E e = this.els[front];
    this.front++;
    return e;
  }

  public void isFull() {
    if (rear == capacity) {
      throw new IllegalArgumentException("the queue size have full");
    }
  }

}
