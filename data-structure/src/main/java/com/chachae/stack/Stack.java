package com.chachae.stack;

/**
 * 栈接口
 *
 * @author chachae
 * @since 2020/4/7 21:25
 */
public interface Stack<E> {

  int getSize();

  boolean isEmpty();

  void push(E e);

  E pop();

  E peek();
}
