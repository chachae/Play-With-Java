package com.chachae.interview.juc.aqs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * 信号量
 *
 * @author chachae
 * @since 2020/3/22 11:31
 */
public class SemaphoreDemo {

  public static void main(String[] args) {

    final int clientCount = 3;
    final int totalCount = 12;
    Semaphore semaphore = new Semaphore(clientCount);
    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < totalCount; i++) {

      executorService.execute(
          () -> {
            try {

              // 获取
              semaphore.acquire();

              System.out.println("run");
              TimeUnit.SECONDS.sleep(2);

            } catch (InterruptedException e) {
              e.printStackTrace();
            } finally {
              // 释放
              semaphore.release();
            }
          });
    }

    executorService.shutdown();
  }
}
