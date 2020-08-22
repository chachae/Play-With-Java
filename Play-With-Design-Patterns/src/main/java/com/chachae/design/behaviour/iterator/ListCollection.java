package com.chachae.design.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器接口
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:40
 */
public class ListCollection implements Collection {

  private final List<Object> list = new ArrayList<>();

  @Override
  public Iterator iterator() {
    return new ConcreteIterator(this);
  }

  @Override
  public Object get(int i) {
    return list.get(i);
  }

  @Override
  public Boolean add(Object object) {
    return list.add(object);
  }

  @Override
  public int size() {
    return list.size();
  }
}
