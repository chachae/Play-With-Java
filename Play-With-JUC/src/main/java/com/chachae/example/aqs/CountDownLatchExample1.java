package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/**
 * @author chachae
 * @date 2019/11/7 13:47
 */
@Slf4j
public class CountDownLatchExample1 {

  private static final Integer threadCount = 200;

  public static void main(String[] args) throws Exception {
    ExecutorService exec = ThreadUtil.newExecutor();
    CountDownLatch countDownLatch = new CountDownLatch(threadCount);
    for (int i = 1; i <= threadCount; i++) {
      final int threadNum = i;
      exec.execute(
          () -> {
            try {
              test(threadNum);
            } catch (Exception e) {
              log.error("exception", e);
            } finally {
              countDownLatch.countDown();
            }
          });
    }
    countDownLatch.await();
    log.info("finish");
    exec.shutdown();
  }

  private static void test(int threadNum) throws Exception {
    Thread.sleep(100);
    log.info("{}", threadNum);
    Thread.sleep(100);
  }
}
