package com.chachae.imooc.collection.set;

import com.chachae.imooc.bst.BST;

/**
 * @author chachae
 * @since 2020/4/12 10:40
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

  private BST<E> bst;

  public BSTSet() {
    bst = new BST<>();
  }

  @Override
  public void add(E e) {
    bst.add(e);
  }

  @Override
  public boolean contains(E e) {
    return bst.contains(e);
  }

  @Override
  public void remove(E e) {
    bst.remove(e);
  }

  @Override
  public int getSize() {
    return bst.size();
  }

  @Override
  public boolean isEmpty() {
    return bst.isEmpty();
  }
}
