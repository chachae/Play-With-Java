package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

/**
 * @author chachae
 * @date 2019/11/7 15:11
 */
@Slf4j
public class CyclicBarrierExample3 {

  /**
   * 增加callback
   * */
  private static CyclicBarrier barrier =
      new CyclicBarrier(5, () -> log.info("callback is running"));

  public static void main(String[] args) throws Exception {

    ExecutorService executor = ThreadUtil.newExecutor();

    for (int i = 1; i <= 10; i++) {
      final int threadNum = i;
      Thread.sleep(1000);
      executor.execute(
          () -> {
            try {
              race(threadNum);
            } catch (Exception e) {
              log.error("exception", e);
            }
          });
    }
    executor.shutdown();
  }

  private static void race(int threadNum) throws Exception {
    Thread.sleep(1000);
    log.info("{} is ready", threadNum);
    barrier.await();
    log.info("{} continue", threadNum);
  }
}
