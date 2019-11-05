package com.chachae.example.commonUnsafe;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @date 2019/11/4 12:21
 */
@Slf4j
@ThreadSafe
public class DateFormatExample2 {

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
              // DataFormat线程不安全，多线程下会抛出异常
              update();
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
    // 每调用一次就创建一个新对象
    DateFormat df = new SimpleDateFormat("yyyyMMdd");
    try {
      df.parse("20190101");
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
