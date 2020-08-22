package com.chachae.guigu.queue;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 11:58
 */
public class ArrayQueue<E> implements Queue<E> {

  private int front;
  private int rear;
  private final E[] data;
  private final Integer maxSize;

  @SuppressWarnings("unchecked")
  public ArrayQueue(int initSize) {
    this.maxSize = initSize;
    this.front = this.rear = 0;
    this.data = (E[]) new Object[initSize];
  }

  public ArrayQueue() {
    this(10);
  }

  @Override
  public void add(E e) {
    isFull();
    this.data[rear++] = e;
  }

  @Override
  public E poll() {
    isEmpty();
    return this.data[front++];
  }

  @Override
  public E peek() {
    isEmpty();
    return this.data[front];
  }

  private void isFull() {
    if (rear == maxSize) {
      throw new IllegalArgumentException("队列已满");
    }
  }

  private void isEmpty() {
    if (rear == front) {
      throw new IllegalArgumentException("队列为空");
    }
  }
}
