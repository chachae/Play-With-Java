package com.chachae.imooc.queue;

/**
 * 循环队列
 *
 * @author chachae
 * @since 2020/4/7 22:18
 */
public class LoopQueue<E> implements Queue<E> {

  private E[] data;

  private int front;

  private int tail;

  private int size;

  public LoopQueue(int capacity) {
    data = (E[]) new Object[capacity + 1];
    front = 0;
    tail = 0;
    size = 0;
  }

  public LoopQueue() {
    this(10);
  }

  public int getCapacity() {
    return getRealLength() - 1;
  }

  private int getRealLength() {
    return data.length;
  }

  @Override
  public boolean isEmpty() {
    return front == tail;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void enqueue(E e) {
    ensureCapacity();
    data[tail] = e;
    tail = (tail + 1) % getRealLength();
    size++;
  }

  @Override
  public E dequeue() {

    if (isEmpty()) {
      throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
    }

    E cur = data[front];
    data[front] = null;
    front = (front + 1) % getRealLength();
    size--;
    ensureCapacity();
    return cur;
  }

  @Override
  public E getFront() {
    if (isEmpty()) {
      throw new IllegalArgumentException("Queue is empty.");
    }
    return data[front];
  }

  private void ensureCapacity() {
    if ((tail + 1) % getRealLength() == front) {
      resize(getCapacity() << 1);
    }
    if (size == getCapacity() >> 2 && getCapacity() >> 1 != 0) {
      resize(getCapacity() >> 1);
    }
  }

  private void resize(int newCapacity) {
    E[] newData = (E[]) new Object[newCapacity + 1];
    for (int i = 0; i < size; i++) {
      newData[i] = data[(i + front) % getRealLength()];
    }

    data = newData;
    front = 0;
    tail = size;
  }

  @Override
  public String toString() {

    StringBuilder res = new StringBuilder();
    res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
    res.append("front [");
    for (int i = front; i != tail; i = (i + 1) % getRealLength()) {
      res.append(data[i]);
      if ((i + 1) % getRealLength() != tail) {
        res.append(", ");
      }
    }
    res.append("] tail");
    return res.toString();
  }
}
