package com.chachae.interview.lock;

import java.util.concurrent.TimeUnit;

/**
 * 死锁Demo
 * <br>
 *   死锁条件：<br>
 *   1. 环路等待<br>
 *   2. 不剥夺<br>
 *   3. 请求与保持请求<br>
 *   4. 互斥
 *
 * @author chenyuexin
 * @date 2021/2/5 9:41
 * @version 1.0
 */
public class DeadlockDemo {

  private static final Object resource1 = new Object();
  private static final Object resource2 = new Object();

  public static void main(String[] args) {
    new Thread(() -> {
      synchronized (resource1) {
        System.out.println(Thread.currentThread().getName() + "get reosurce 1");
        try {
          TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException ignore) {
        }
        System.out.println(Thread.currentThread().getName() + "waiting resource 2");
        synchronized (resource2) {
          // 永远执行不到
          System.out.println(Thread.currentThread().getName() + " get resource 1");
        }
      }
    }, "t1")
        .start();

    new Thread(() -> {
      synchronized (resource2) {
        System.out.println(Thread.currentThread().getName() + "get reosurce 2");
        try {
          TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException ignore) {
        }
        System.out.println(Thread.currentThread().getName() + "waiting resource 1");
        synchronized (resource1) {
          // 永远执行不到
          System.out.println(Thread.currentThread().getName() + "get reosurce 1");
        }
      }
    }, "t2")
        .start();
  }

}
