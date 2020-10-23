package com.chachae.interview.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author chachae
 * @date 2020/10/22 12:07
 * @version v1.0
 */
public class VolatileDemo {

  private static volatile Integer n = 0;
  private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

  public static void func() {
    for (int i = 0; i < 10000; i++) {
      EXECUTOR_SERVICE.execute(() -> {
        synchronized (n) {
          ++n;
        }
      });
    }
  }

  public static void main(String[] args) {
    func();
    EXECUTOR_SERVICE.shutdown();
    System.out.println(n);
  }
}