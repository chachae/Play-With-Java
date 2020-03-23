package com.chachae.demo.atomic;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chachae
 * @since 2020/1/12 20:32
 */
@Slf4j
public class AtomicDemo1 {

  private static AtomicInteger count = new AtomicInteger(0);
  private final int threadCount = 10000;

  private void increase() {
    count.incrementAndGet();
  }

  @Test
  public void test() throws InterruptedException {

    Semaphore semaphore = new Semaphore(2000);
    // 计数器并发包
    final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
    ExecutorService executor = ThreadUtil.newExecutor();
    executor.execute(
        () -> {
          for (int i = 0; i < threadCount; i++) {
            try {
              semaphore.acquire();
              increase();
              semaphore.release();
            } catch (InterruptedException e) {
              e.printStackTrace();
            } finally {
              countDownLatch.countDown();
            }
          }
        });

    executor.shutdown();
    countDownLatch.await();
    log.info("count: {}", count.get());
  }
}
