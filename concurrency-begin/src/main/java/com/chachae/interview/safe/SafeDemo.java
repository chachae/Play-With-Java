package com.chachae.interview.safe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程安全 Demo-1
 *
 * @author chachae
 * @since 2020/3/22 15:42
 */
public class SafeDemo {

  /** Atom 原子类 */
  private AtomicInteger result = new AtomicInteger(0);

  private void add() {
    result.incrementAndGet();
  }

  private int get() {
    return this.result.get();
  }

  public static void main(String[] args) {
    // 线程总量：10000
    final int threadCount = 10000;
    // 安全对象
    SafeDemo demo = new SafeDemo();
    // countdownLatch
    CountDownLatch countDownLatch = new CountDownLatch(threadCount);
    // 线程池
    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < threadCount; i++) {
      executorService.execute(
          () -> {
            demo.add();
            // countdown
            countDownLatch.countDown();
          });
    }
    try {
      // 挂起
      countDownLatch.await();
      // 关闭线程池
      executorService.shutdown();
      System.out.println("共计：" + demo.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
