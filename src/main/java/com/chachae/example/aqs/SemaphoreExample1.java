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
public class SemaphoreExample1 {

  private static final Integer threadCount = 20;

  public static void main(String[] args) throws Exception {
    ExecutorService exec = ThreadUtil.newExecutor();
    // 一个时间允许5个并发线程
    final Semaphore semaphore = new Semaphore(5);
    for (int i = 1; i <= threadCount; i++) {
      final int threadNum = i;
      exec.execute(
          () -> {
            try {
              // 获取并发数许可
              semaphore.acquire();
              test(threadNum);
              // 释放许可
              semaphore.release();
            } catch (Exception e) {
              log.error("exception", e);
            }
          });
    }
    exec.shutdown();
  }

  private static void test(int threadNum) throws Exception {
    Thread.sleep(1000);
    log.info("{}", threadNum);
  }
}
