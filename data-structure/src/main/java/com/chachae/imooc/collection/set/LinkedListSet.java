package com.chachae.imooc.collection.set;

import com.chachae.imooc.linked.LinkedList;

/**
 * @author chachae
 * @since 2020/4/12 10:48
 */
public class LinkedListSet<E> implements Set<E> {

  private LinkedList<E> list;

  private LinkedListSet() {
    list = new LinkedList<>();
  }

  @Override
  public void add(E e) {
    if (!contains(e)) {
      list.addFirst(e);
    }
  }

  @Override
  public boolean contains(E e) {
    return list.contains(e);
  }

  @Override
  public void remove(E e) {
    list.removeElement(e);
  }

  @Override
  public int getSize() {
    return list.getSize();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }
}
