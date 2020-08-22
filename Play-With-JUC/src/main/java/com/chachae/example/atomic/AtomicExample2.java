package com.chachae.example.atomic;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author chachae
 * @date 2019/9/6 13:05
 */
@ThreadSafe
@Slf4j
public class AtomicExample2 {

  /**
   * LongAdder 和 AtomicLong 的对比
   *
   * <p>{@link LongAdder}：使用数据分离，Hash 映射，提高并行性，适用于全局ID 有序生成，高精度场景
   *
   * <p>{@link java.util.concurrent.atomic.AtomicLong}：适用于线程竞争度小的场景
   */
  private static LongAdder count = new LongAdder();

  public static void main(String[] args) throws InterruptedException {
    // 定义线程池
    ExecutorService executorService = ThreadUtil.newExecutor();
    // 请求总数
    int clintTotal = 5000;
    // 同时并发执行的线程数
    int threadTotal = 50;
    // 定义信号量
    final Semaphore semaphore = new Semaphore(threadTotal);
    // 计数器并发包
    final CountDownLatch countDownLatch = new CountDownLatch(clintTotal);
    for (int i = 0; i < clintTotal; i++) {
      executorService.execute(
          () -> {
            try {
              semaphore.acquire();
              add();
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            }
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    executorService.shutdown();
    log.info("count:{}", count);
  }

  private static void add() {
    count.increment();
  }
}
