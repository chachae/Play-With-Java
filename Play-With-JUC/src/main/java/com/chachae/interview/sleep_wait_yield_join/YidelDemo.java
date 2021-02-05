package com.chachae.interview.sleep_wait_yield_join;

/**
 * 和 sleep 一样都是 Thread 类的方法，都是暂停当前正在执行的线程对象，
 * 不会释放资源锁，和 sleep 不同的是 yield方法并不会让线程进入阻塞状态，
 * 而是让线程重回就绪状态，它只需要等待重新获取CPU执行时间，所以执行yield()
 * 的线程有可能在进入到可执行状态后马上又被执行。还有一点和 sleep 不同的是
 * yield 方法只能使同优先级或更高优先级的线程有执行的机会
 *
 * @author chenyuexin
 * @date 2021/2/5 11:06
 * @version 1.0
 */
public class YidelDemo {

  private static final Object obj = new Object();

  public static void main(String[] args) {
    Thread t3 = new Thread(new MyThread3());
    Thread t1 = new Thread(new MyThread1());
    Thread t2 = new Thread(new MyThread2());
    t3.start();
    t1.start();
    t2.start();
  }

  static class MyThread1 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread1 start");
        Thread.yield();
        System.out.println("thread1 end");
      }
    }
  }

  static class MyThread2 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread2 start");
        System.out.println("thread2 end");
      }
    }
  }

  static class MyThread3 implements Runnable {

    @Override
    public void run() {
      System.out.println("thread3 start");
      Thread.yield();
      System.out.println("thread3 end");
    }
  }

}
