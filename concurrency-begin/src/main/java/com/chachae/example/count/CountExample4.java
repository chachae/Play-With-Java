package com.chachae.example.count;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annotations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @date 2019/9/6 13:05
 */
@NotThreadSafe
@Slf4j
public class CountExample4 {

  /*
  使用volatile修饰计数值
   */
  private static volatile int count = 0;

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
    count++;
    /*
    1. 取出最新值
    2. +1
    3. 写回主存

    如果有两个线程同时取到最新值并且赋值回主存，则相当于丢失了一次++ 操作
     */
  }
}
