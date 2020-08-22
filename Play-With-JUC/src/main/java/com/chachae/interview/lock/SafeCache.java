package com.chachae.interview.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 16:40
 */
public class SafeCache {

  private final Map<String, Object> cacheMap;

  public SafeCache(int capacity) {
    cacheMap = new HashMap<>(capacity);
  }

  public SafeCache() {
    this(16);
  }

  private final ReadWriteLock lock = new ReentrantReadWriteLock();

  private final Lock readLock = lock.readLock();
  private final Lock writeLock = lock.writeLock();

  public void put(String key, Object value) {
    try {
      writeLock.lock();
      this.cacheMap.put(key, value);
    } finally {
      writeLock.unlock();
    }
  }

  public Object get(String key) {
    try {
      readLock.lock();
      return this.cacheMap.get(key);
    } finally {
      readLock.unlock();
    }
  }

  public int size() {
    return this.cacheMap.size();
  }

}
