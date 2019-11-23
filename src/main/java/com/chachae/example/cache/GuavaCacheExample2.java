package com.chachae.example.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Guava cache
 *
 * @author chachae
 * @date 2019/11/23 11:07
 */
@Slf4j
public class GuavaCacheExample2 {

  public static void main(String[] args) {

    Cache<String, Integer> cache =
        CacheBuilder.newBuilder()
            // 最多存放10个数据
            .maximumSize(10)
            // 缓存10秒
            .expireAfterWrite(10, TimeUnit.SECONDS)
            // 开启记录状态数据功能
            .recordStats()
            .build();
    // null
    log.info("{}", cache.getIfPresent("key1"));
    cache.put("key1", 1);
    // 1
    log.info("{}", cache.getIfPresent("key1"));
    cache.invalidate("key1");
    // null
    log.info("{}", cache.getIfPresent("key1"));
    try {
      // -1
      log.info("{}", cache.get("key2", () -> -1));
      cache.put("key2", 2);
      // 2
      log.info("{}", cache.get("key2", () -> -1));
      // 1
      log.info("{}", cache.size());
      for (int i = 3; i < 13; i++) {
        cache.put("key" + i, i);
      } // 10
      log.info("{}", cache.size());
      // null
      log.info("{}", cache.getIfPresent("key2"));
      Thread.sleep(11000);
      // -1
      log.info("{}", cache.get("key5", () -> -1));
      log.info("{},{}", cache.stats().hitCount(), cache.stats().missCount());
      log.info("{},{}", cache.stats().hitRate(), cache.stats().missRate());
    } catch (Exception e) {
      log.error("cache exception", e);
    }
  }
}
