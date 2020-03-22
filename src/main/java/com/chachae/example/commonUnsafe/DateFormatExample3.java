package com.chachae.example.commonUnsafe;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * joda Time -> 线程安全【推荐，1. 线程安全 2. 处理时间有优势】
 *
 * @author chachae
 * @date 2019/11/4 12:21
 */
@Slf4j
@ThreadSafe
public class DateFormatExample3 {

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
      final int count = i;
      executorService.execute(
          () -> {
            try {
              semaphore.acquire();
              update();
              // 打印索引值
              log.info("{}", count);
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            }
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    executorService.shutdown();
  }

  private static void update() {
    DateTime.parse("20190101");
  }
}
