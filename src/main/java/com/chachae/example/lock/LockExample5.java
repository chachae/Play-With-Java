package com.chachae.example.lock;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock
 *
 * @see <a href="https://segmentfault.com/a/1190000015808032?utm_source=tag-newest"/>
 * @author chachae
 * @date 2019/11/10 12:55
 */
@Slf4j
@ThreadSafe
public class LockExample5 {

  // 请求总数
  public static int clientTotal = 5000;

  // 同时并发执行的线程数
  public static int threadTotal = 200;

  public static int count = 0;

  private static final StampedLock lock = new StampedLock();

  public static void main(String[] args) throws Exception {
    ExecutorService executorService = ThreadUtil.newExecutor();
    final Semaphore semaphore = new Semaphore(threadTotal);
    final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
    for (int i = 0; i < clientTotal; i++) {
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
    // 获取写锁
    long stamp = lock.writeLock();
    try {
      count++;
    } finally {
      // 解锁
      lock.unlock(stamp);
    }
  }
}
