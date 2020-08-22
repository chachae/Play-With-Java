package com.chachae.imooc.queue;

import com.chachae.imooc.array.Array;

/**
 * 数组队列
 *
 * @author chachae
 * @since 2020/4/7 22:05
 */
public class ArrayQueue<E> implements Queue<E> {

  private Array<E> array;

  public ArrayQueue(int capacity) {
    array = new Array<>(capacity);
  }

  public ArrayQueue() {
    array = new Array<>();
  }

  @Override
  public int getSize() {
    return array.getSize();
  }

  @Override
  public boolean isEmpty() {
    return array.isEmpty();
  }

  @Override
  public void enqueue(E e) {
    array.add(e);
  }

  @Override
  public E dequeue() {
    return array.remove(0);
  }

  @Override
  public E getFront() {
    return array.get(0);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("Queue: ");
    res.append("front [");
    for (int i = 0; i < array.getSize(); i++) {
      res.append(array.get(i));
      if (i != array.getSize() - 1) {
        res.append(", ");
      }
    }
    res.append("] tail");
    return res.toString();
  }
}
