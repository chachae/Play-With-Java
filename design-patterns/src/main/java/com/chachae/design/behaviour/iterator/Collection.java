package com.chachae.design.behaviour.iterator;

/**
 * 迭代器接口
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:40
 */
public interface Collection {

  Iterator iterator();

  Object get(int i);

  Boolean add(Object object);

  int size();
}
