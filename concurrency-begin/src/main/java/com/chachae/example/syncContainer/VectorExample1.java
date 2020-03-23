package com.chachae.example.syncContainer;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @date 2019/11/5 9:31
 */
@Slf4j
@ThreadSafe
public class VectorExample1 {
  // 请求总数
  private static int clientTotal = 5000;

  // 同时并发执行的线程数
  public static int threadTotal = 200;

  private static List<Integer> list = new Vector<>();

  public static void main(String[] args) throws Exception {
    ExecutorService executorService = ThreadUtil.newExecutor();
    final Semaphore semaphore = new Semaphore(threadTotal);
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
    log.info("size:{}", list.size());
  }

  private static void update(int i) {
    list.add(i);
  }
}
