package com.chachae.design.behaviour.iterator;

/**
 * 迭代器接口
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:40
 */
public class ConcreteIterator implements Iterator {

  private final Collection collection;

  private int pos = -1;

  public ConcreteIterator(Collection collection) {
    this.collection = collection;
  }

  @Override
  public Object previous() {
    if (pos > 0) {
      pos--;
    }
    return collection.get(pos);
  }

  @Override
  public Object next() {
    if (pos < collection.size() - 1) {
      pos++;
    }
    return collection.get(pos);
  }

  @Override
  public boolean hasNext() {
    return pos < collection.size() - 1;
  }
}
