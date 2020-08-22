package com.chachae.imooc.stack;

import com.chachae.imooc.array.Array;

/**
 * @author chachae
 * @since 2020/4/7 21:25
 */
public class ArrayStack<E> implements Stack<E> {

  private Array<E> array;

  public ArrayStack(int capacity) {
    array = new Array<>(capacity);
  }

  public ArrayStack() {
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
  public void push(E e) {
    if (getSize() == 0) {
      array.add(0, e);
    } else {
      array.add(getSize(), e);
    }
  }

  @Override
  public E pop() {
    return array.remove(getSize() - 1);
  }

  @Override
  public E peek() {
    return array.get(getSize() - 1);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("Stack: ");
    res.append('[');
    for (int i = 0; i < array.getSize(); i++) {
      res.append(array.get(i));
      if (i != array.getSize() - 1) {
        res.append(", ");
      }
    }
    res.append("] top");
    return res.toString();
  }
}
