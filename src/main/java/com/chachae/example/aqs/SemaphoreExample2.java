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
public class SemaphoreExample2 {

  private static final int threadCount = 20;

  public static void main(String[] args) {

    ExecutorService exec = ThreadUtil.newExecutor();

    final Semaphore semaphore = new Semaphore(3);

    for (int i = 0; i < threadCount; i++) {
      final int threadNum = i;
      exec.execute(
          () -> {
            try {
              semaphore.acquire(3); // 获取多个许可
              test(threadNum);
              semaphore.release(3); // 释放多个许可
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
