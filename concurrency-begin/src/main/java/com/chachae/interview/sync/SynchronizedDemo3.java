package com.chachae.interview.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 需求： 1. 多个下线程交替操作，生产一个数字消费一个数字
 *
 * @author chachae
 * @since 2020/3/24 16:39
 */
class SyncDemo {

  private int number = 0;

  public synchronized void provide() {
    try {
      while (number != 0) {
        this.wait();
      }
      number++;
      System.out.println(Thread.currentThread().getName() + "\t" + number);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.notifyAll();
    }
  }

  public synchronized void consumer() {
    try {
      while (number == 0) {
        this.wait();
      }
      number--;
      System.out.println(Thread.currentThread().getName() + "\t" + number);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.notifyAll();
    }
  }
}

class SyncLockDemo {

  private int number = 0;

  private Lock lock = new ReentrantLock();

  public void provide() {
    lock.lock();
    try {
      while (number == 0) {
        number++;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public void consumer() {
    lock.lock();
    try {
      while (number == 1) {
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }
}

class Main3 {

  public static void main(String[] args) throws InterruptedException {

    long start = System.currentTimeMillis();
    SyncDemo demo = new SyncDemo();
    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < 100; i++) {
      executorService.execute(
          () -> {
            demo.provide();
            demo.consumer();
          });
    }
    long end = System.currentTimeMillis();

    long start2 = System.currentTimeMillis();
    SyncLockDemo demo2 = new SyncLockDemo();
    ExecutorService executorService2 = Executors.newCachedThreadPool();
    for (int i = 0; i < 100; i++) {
      executorService2.execute(
          () -> {
            demo2.provide();
            demo2.consumer();
          });
    }
    long end2 = System.currentTimeMillis();

    TimeUnit.SECONDS.sleep(1);
    System.out.println("SyncDemo 耗时：" + (end - start) + "ms");
    System.out.println("SyncLockDemo 耗时：" + (end2 - start2) + "ms");
  }
}
