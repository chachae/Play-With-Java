package com.chachae.queue;

/**
 * @author chachae
 * @since 2020/4/7 22:05
 */
public interface Queue<E> {

  int getSize();

  boolean isEmpty();

  void enqueue(E e);

  E dequeue();

  E getFront();
}
