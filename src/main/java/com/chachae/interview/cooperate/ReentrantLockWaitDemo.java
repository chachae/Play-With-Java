package com.chachae.interview.cooperate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chachae
 * @since 2020/3/21 21:58
 */
public class ReentrantLockWaitDemo {

  private Lock lock = new ReentrantLock();
  private Condition condition = lock.newCondition();

  public void before() {
    lock.lock();
    try {
      System.out.println("before");
      // 唤醒全部线程
      condition.signalAll();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public void after() {
    lock.lock();
    try {
      System.out.println("after");
      // 挂起线程
      condition.await();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) {
    ReentrantLockWaitDemo demo = new ReentrantLockWaitDemo();
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(demo::before);
    executorService.execute(demo::after);
  }
}
