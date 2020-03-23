package com.chachae.interview.juc.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chachae
 * @since 2020/3/22 11:02
 */
public class CountdownLatchDemo {

  public static void main(String[] args) throws InterruptedException {

    final int totalThread = 10;
    CountDownLatch countDownLatch = new CountDownLatch(totalThread);
    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < totalThread; i++) {
      executorService.execute(
          () -> {
            System.out.print("run..");
            countDownLatch.countDown();
          });
    }
    countDownLatch.await();
    System.out.println("end");

    executorService.shutdown();
  }
}
