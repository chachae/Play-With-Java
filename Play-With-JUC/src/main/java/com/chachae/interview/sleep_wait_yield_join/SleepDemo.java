package com.chachae.interview.sleep_wait_yield_join;

/**
 * sleep 不会让出线程
 *
 * @author chenyuexin
 * @date 2021/2/5 10:09
 * @version 1.0
 */
public class SleepDemo {

  private static final Object obj = new Object();

  public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread1());
    Thread t2 = new Thread(new MyThread2());
    t1.start();
    t2.start();
  }

  public static class MyThread1 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread1 start");
        try {
          // 5s
          Thread.sleep(5000);
        } catch (InterruptedException ignore) {
        }
        System.out.println("thread1 end");
      }
    }
  }

  public static class MyThread2 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread2 start");
        System.out.println("thread2 end");
      }
    }
  }
}
