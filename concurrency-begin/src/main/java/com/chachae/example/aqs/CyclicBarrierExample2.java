package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author chachae
 * @date 2019/11/7 15:11
 */
@Slf4j
public class CyclicBarrierExample2 {

  private static CyclicBarrier barrier = new CyclicBarrier(5);

  public static void main(String[] args) throws Exception {
    ExecutorService exec = ThreadUtil.newExecutor();
    for (int i = 1; i <= 10; i++) {
      final int threadNum = i;
      Thread.sleep(1000);
      exec.execute(
          () -> {
            try {
              race(threadNum);
            } catch (Exception e) {
              // log.error("exception", e);
            }
          });
    }
  }

  private static void race(int threadNum) throws Exception {
    Thread.sleep(1000);
    log.info("{} is ready", threadNum);
    try {
      barrier.await(2000, TimeUnit.MILLISECONDS);
    } catch (Exception e) {
      // log.warn("BarrierException", e);
    }
    log.info("{} continue", threadNum);
  }
}
