package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author chachae
 * @date 2019/11/7 13:47
 */
@Slf4j
public class SemaphoreExample4 {

  private static final int threadCount = 20;

  public static void main(String[] args) {

    ExecutorService exec = ThreadUtil.newExecutor();

    final Semaphore semaphore = new Semaphore(5);

    for (int i = 0; i < threadCount; i++) {
      final int threadNum = i;
      exec.execute(
          () -> {
            try {
              // 尝试获取一个许可，并允许等待
              if (semaphore.tryAcquire(2000, TimeUnit.MILLISECONDS)) {
                test(threadNum);
                // 释放一个许可
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
