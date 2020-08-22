package com.chachae.guigu.queue;

/**
 * 循环（环型）队列
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 14:10
 */
public class CircleArrayQueue<E> implements Queue<E> {

  private E[] data;
  private int front;
  private int rear;
  private final int size;

  @SuppressWarnings("unchecked")
  public CircleArrayQueue(int size) {
    this.size = size + 1;
    this.front = this.rear = 0;
    data = (E[]) new Object[this.size];
  }

  public CircleArrayQueue() {
    this(10);
  }

  public int getLength() {
    return size - 1;
  }

  @Override
  public void add(E e) {
    isFull();
    data[rear] = e;
    rear = (rear + 1) % size;
  }

  @Override
  public E poll() {
    isEmpty();
    E res = data[front];
    front = (front + 1) % size;
    return res;
  }

  @Override
  public E peek() {
    isEmpty();
    return data[front];
  }

  private void isFull() {
    if ((rear + 1) % size == front) {
      resize(size - 1);
    }
  }

  private void isEmpty() {
    if (front == rear) {
      throw new IllegalArgumentException("队列为空");
    }
  }

  @SuppressWarnings("unchecked")
  private void resize(int newCapacity) {
    E[] newData = (E[]) new Object[newCapacity + 1];
    for (int i = 0; i < size; i++) {
      newData[i] = data[(i + front) % size];
    }
    data = newData;
    front = 0;
    rear = size;
  }
}
