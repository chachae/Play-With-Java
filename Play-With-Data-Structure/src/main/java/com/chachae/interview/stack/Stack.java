package com.chachae.interview.stack;

/**
 * A simple stack
 *
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 20:53
 */
public class Stack<E> {

  private int size;

  private final E[] elms;

  private final int capacity;

  public Stack(int capacity) {
    this.size = 0;
    this.capacity = capacity;
    this.elms = (E[]) new Object[capacity];
    if (capacity <= 0) {
      throw new IllegalArgumentException("the capacity can`t less than 0");
    }
  }

  public Stack() {
    this(10);
  }

  public void push(E e) {
    isFull();
    this.elms[size] = e;
    this.size++;
  }

  public E pop() {
    E elm = this.elms[size - 1];
    size--;
    return elm;
  }

  public E peek() {
    return this.elms[size - 1];
  }


  private void isFull() {
    if (this.capacity == size) {
      throw new IllegalArgumentException("the stack size is full");
    }
  }

}
