package com.chachae.example.lock;

import com.chachae.annoations.ThreadSafe;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReentrantReadWriteLock
 *
 * @author chachae
 * @date 2019/11/10 12:12
 */
@Slf4j
@ThreadSafe
public class LockExample3 {

  private final Map<String, Data> map = Maps.newTreeMap();

  // 请求总数
  public static int clientTotal = 5000;

  // 同时并发执行的线程数
  public static int threadTotal = 200;

  public static int count = 0;

  private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

  // 读锁
  private final Lock readLock = lock.readLock();

  // 写锁
  private final Lock writeLock = lock.writeLock();

  public Data get(String key) {
    readLock.lock();
    try {
      return map.get(key);
    } finally {
      readLock.unlock();
    }
  }

  public Set<String> getAllKeys() {
    readLock.lock();
    try {
      return map.keySet();
    } finally {
      readLock.unlock();
    }
  }

  public Data put(String key, Data value) {
    writeLock.lock();
    try {
      return map.put(key, value);
    } finally {
      readLock.unlock();
    }
  }

  class Data {}
}
