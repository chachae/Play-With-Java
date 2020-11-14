package com.chachae.java.collection.thread.dead;

import java.util.concurrent.TimeUnit;

/**
 * 死锁
 * 
 * @author chachae
 * @version v1.0
 * @date 2020/10/31 21:36
 */
public class Demo {

  private static final Object o1 = new Object();

  private static final Object o2 = new Object();

  public static void main(String[] args) throws Exception {

    new Thread(() -> {
      synchronized (o1) {
        System.out.println(Thread.currentThread().getName() + " get o1");
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("waiting get o2");
        synchronized (o2) {
          System.out.println(Thread.currentThread().getName() + " get o2 ");
        }
      }
    }).start();

    new Thread(() -> {
      synchronized (o2) {
        System.out.println(Thread.currentThread().getName() + " get o2");
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("waiting get o2");
        synchronized (o1) {
          System.out.println(Thread.currentThread().getName() + " get o1 ");
        }
      }
    }).start();


  }

}
