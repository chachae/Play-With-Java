package com.chachae.interview.juc.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 循环屏障
 *
 * @author chachae
 * @since 2020/3/22 11:24
 */
public class CyclicBarrierDemo {

  public static void main(String[] args) {

    final int total = 10;
    CyclicBarrier cyclicBarrier = new CyclicBarrier(total);
    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < total; i++) {
      executorService.execute(
          () -> {
            try {
              System.out.println("run...");
              cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
              e.printStackTrace();
            }
            System.out.println("after...");
          });
    }

    executorService.shutdown();
  }
}
