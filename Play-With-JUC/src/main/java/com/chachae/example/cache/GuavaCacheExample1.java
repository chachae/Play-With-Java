package com.chachae.example.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;

import java.util.concurrent.TimeUnit;

/**
 * Guava cache
 *
 * @author chachae
 * @date 2019/11/23 11:03
 */
@Slf4j
public class GuavaCacheExample1 {

  public static void main(String[] args) {

    LoadingCache<String, Integer> cache =
        CacheBuilder.newBuilder()
            // 最多存放10个数据
            .maximumSize(10)
            // 缓存10秒
            .expireAfterWrite(10, TimeUnit.SECONDS)
            // 开启记录状态数据功能
            .recordStats()
            .build(
                new CacheLoader<String, Integer>() {
                  @Override
                  public Integer load(@NonNull String key) {
                    return -1;
                  }
                });
    // null
    log.info("{}", cache.getIfPresent("key1"));
    cache.put("key1", 1);
    // 1
    log.info("{}", cache.getIfPresent("key1"));
    // 销毁 key
    cache.invalidate("key1");
    // null
    log.info("{}", cache.getIfPresent("key1"));
    try {
      // -1
      log.info("{}", cache.get("key2"));
      cache.put("key2", 2);
      // 2
      log.info("{}", cache.get("key2"));
      // 1
      log.info("{}", cache.size());
      for (int i = 3; i < 13; i++) {
        cache.put("key" + i, i);
      }
      // 10
      log.info("{}", cache.size());
      // null
      log.info("{}", cache.getIfPresent("key2"));

      Thread.sleep(11000);
      // -1
      log.info("{}", cache.get("key5"));

      log.info("{},{}", cache.stats().hitCount(), cache.stats().missCount());

      log.info("{},{}", cache.stats().hitRate(), cache.stats().missRate());
    } catch (Exception e) {
      log.error("cache exception", e);
    }
  }
}
