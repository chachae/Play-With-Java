package com.chachae.interview.sleep_wait_yield_join;

/**
 * wait 会让出线程<br>
 *   wait 方法是属于 Object 类中的，wait 过程中线程会释放对象锁，
 *   只有当其他线程调用 notify 才能唤醒此线程。wait 使用时必须先
 *   获取对象锁，即必须在 synchronized 修饰的代码块中使用，那么
 *   相应的 notify 方法同样必须在 synchronized 修饰的代码块中使
 *   用，如果没有在synchronized 修饰的代码块中使用时运行时会抛出
 *   IllegalMonitorStateException的异常
 *
 * @author chenyuexin
 * @date 2021/2/5 10:09
 * @version 1.0
 */
public class WaitDemo {

  private static final Object obj = new Object();

  public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread1());
    Thread t2 = new Thread(new MyThread2());
    t1.start();
    t2.start();
  }

  static class MyThread1 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread1 start");
        try {
          Thread.sleep(2000);
          obj.wait();
        } catch (InterruptedException ignore) {
        }
        System.out.println("thread1 end");
      }
    }
  }

  static class MyThread2 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread2 start");
        obj.notify(); // 通知
        // obj.notifyAll();
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("thread2 end");
      }
    }
  }

}
