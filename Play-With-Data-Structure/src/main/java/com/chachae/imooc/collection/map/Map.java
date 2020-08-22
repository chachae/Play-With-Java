package com.chachae.imooc.collection.map;

/**
 * 映射接口
 *
 * @param <K> 键
 * @param <V> 值
 */
public interface Map<K, V> {

  void add(K key, V value);

  V remove(K key);

  boolean contains(K key);

  V get(K key);

  void set(K key, V newValue);

  int getSize();

  boolean isEmpty();
}
