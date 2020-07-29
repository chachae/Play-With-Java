package com.chachae.imooc.collection.set;

/**
 * @author chachae
 * @since 2020/4/12 10:40
 */
public interface Set<E> {

  void add(E e);

  boolean contains(E e);

  void remove(E e);

  int getSize();

  boolean isEmpty();
}

