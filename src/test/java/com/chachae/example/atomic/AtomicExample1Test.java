package com.chachae.example.atomic;

import org.junit.Test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author chachae
 * @since 2020/1/12 18:27
 */
public class AtomicExample1Test {

  private static AtomicLong count = new AtomicLong(0);

  @Test
  public void test() throws InterruptedException {

    Semaphore semaphore = new Semaphore(5);

    int k = 0;
    for (int i = 0; i < 10; i++) {
      semaphore.acquire();
      System.out.printf("%s : %s\n", i, k++);
       semaphore.release();
    }
  }
}
