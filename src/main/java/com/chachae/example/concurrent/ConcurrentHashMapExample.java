package com.chachae.example.concurrent;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @date 2019/11/5 22:34
 */
@Slf4j
@ThreadSafe
public class ConcurrentHashMapExample {

  // 同时并发执行的线程数
  public static int threadTotal = 200;

  private static Map<Integer, Integer> map = new ConcurrentHashMap<>();

  public static void main(String[] args) throws Exception {
    ExecutorService executorService = ThreadUtil.newExecutor();
    final Semaphore semaphore = new Semaphore(threadTotal);
    // 请求总数
    int clientTotal = 5000;
    final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
    for (int i = 0; i < clientTotal; i++) {
      final int count = i;
      executorService.execute(
          () -> {
            try {
              semaphore.acquire();
              update(count);
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            }
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    executorService.shutdown();
    log.info("size:{}", map.size());
  }

  private static void update(int i) {
    map.put(i, i);
  }
}
