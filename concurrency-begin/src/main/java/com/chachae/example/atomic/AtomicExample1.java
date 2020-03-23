package com.chachae.example.atomic;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author chachae
 * @date 2019/9/6 13:05
 */
@ThreadSafe
@Slf4j
public class AtomicExample1 {

  private static AtomicLong count = new AtomicLong(0);

  private static void add() {
    count.incrementAndGet();
  }

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
              // 每个acquire()方法都会阻塞，直到获取一个可用的许可证
              semaphore.acquire();
              // 调用方法
              add();
              // 每个release()方法都会释放持有许可证的线程，并且归还Semaphore一个可用的许可证
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            } finally {
              countDownLatch.countDown();
            }
          });
    }

    countDownLatch.await();
    executorService.shutdown();
    log.info("count:{}", count);
  }
}
