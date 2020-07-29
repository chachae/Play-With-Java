package com.chachae.guigu.queue;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 11:58
 */
public interface Queue<E> {

  void add(E e);

  E poll();

  E peek();
}
