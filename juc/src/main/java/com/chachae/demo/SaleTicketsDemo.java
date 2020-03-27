package com.chachae.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 卖票Demo
 *
 * @author chachae
 * @since 2020/3/23 17:37
 */
class Sale {

  /** 总票数 */
  private static int TICKET_NUM = 3000;
  /** 可重入锁 */
  private Lock lock = new ReentrantLock();

  public void sale() {
    lock.lock();
    try {
      if (TICKET_NUM > 0) {
        TICKET_NUM--;
        System.out.println(
            "线程[ " + Thread.currentThread().getName() + " ] 卖出1张票，还剩 " + TICKET_NUM + " 张票。");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }
}

class Main {

  public static void main(String[] args) {

    Sale sale = new Sale();

    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(
        () -> {
          for (int i = 0; i < 3000; i++) {
            sale.sale();
          }
        });

    executorService.execute(
        () -> {
          for (int i = 0; i < 3000; i++) {
            sale.sale();
          }
        });

    executorService.execute(
        () -> {
          for (int i = 0; i < 3000; i++) {
            sale.sale();
          }
        });
  }
}
