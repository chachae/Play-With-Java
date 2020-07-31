package com.chachae;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 18:14
 */
public class MainTest {

  private static final ExecutorService POOL = Executors.newFixedThreadPool(100);
  private static final Integer TARGET = Integer.MAX_VALUE;

  public static void main(String[] args) {
    POOL.execute(() -> {
      for (int i = TARGET; i > 0; i -= 2) {
        int c = i * 100;
        if (c >= 0 && c <= 5) {
          System.out.printf("a:%d | c:%d%n", i, c);
        }
      }
    });

    POOL.shutdown();
  }
}
