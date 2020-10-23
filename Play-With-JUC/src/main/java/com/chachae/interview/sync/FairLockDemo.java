package com.chachae.interview.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author chachae
 * @date 2020/10/22 10:38
 * @version v1.0
 */
public class FairLockDemo {

  private static final Lock lock = new ReentrantLock(false);
  private static final ExecutorService executorService = Executors.newCachedThreadPool();

  private static void doSomething() {
    lock.lock();
    Thread currentThread = Thread.currentThread();
    System.out.printf("[ %s ] %s%n", currentThread.getId(), currentThread.getName());
    lock.unlock();
  }

  public static void main(String[] args) {

    executorService.execute(FairLockDemo::doSomething);
    executorService.execute(FairLockDemo::doSomething);
    executorService.execute(FairLockDemo::doSomething);
    executorService.execute(FairLockDemo::doSomething);
    executorService.execute(FairLockDemo::doSomething);

    executorService.shutdown();
  }
}
