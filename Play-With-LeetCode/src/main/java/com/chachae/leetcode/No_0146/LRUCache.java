package com.chachae.leetcode.No_0146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/lru-cache/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class LRUCache {

  /**
   * 在LinkedHashMap的get()方法中，我们每次获取元素的时候，都要调用afterNodeAccess(e)都要将元素移动到尾部。 话外音：accessOrder为true，是基于访问排序，accessOrder为基于插入排序。我们想要LinkedHashMap实现LRU 功能，accessOrder必须为true。如果accessOrder为false，那就是FIFO了。
   */

  int capacity;
  LinkedHashMap<Integer, Integer> cache;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry eldest) {
        return cache.size() > capacity;
      }
    };
  }

  public int get(int key) {
    return cache.getOrDefault(key, -1);
  }

  public void put(int key, int value) {
    cache.put(key, value);
  }
}