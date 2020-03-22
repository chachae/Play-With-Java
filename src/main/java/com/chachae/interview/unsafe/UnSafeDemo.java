package com.chachae.interview.unsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程不安全演示 Demo-1
 *
 * @author chachae
 * @since 2020/3/22 15:35
 */
public class UnSafeDemo {

  private int result = 0;

  private void add() {
    result++;
  }

  private int get() {
    return this.result;
  }

  public static void main(String[] args) {
    // 线程总量：10000
    final int threadCount = 10000;
    // 不安全对象
    UnSafeDemo demo = new UnSafeDemo();
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
