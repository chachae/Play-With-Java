package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/**
 * @author chachae
 * @date 2019/11/7 13:47
 */
@Slf4j
public class SemaphoreExample3 {

  private static final int threadCount = 20;

  public static void main(String[] args) {

    ExecutorService exec = ThreadUtil.newExecutor();
    final Semaphore semaphore = new Semaphore(5);
    for (int i = 1; i <= threadCount; i++) {
      final int threadNum = i;
      exec.execute(
          () -> {
            try {
              // 尝试获取许可
              if (semaphore.tryAcquire()) {
                test(threadNum);
                semaphore.release();
              }
            } catch (Exception e) {
              log.error("exception", e);
            }
          });
    }
    exec.shutdown();
  }

  private static void test(int threadNum) throws Exception {
    log.info("{}", threadNum);
    Thread.sleep(1000);
  }
}
