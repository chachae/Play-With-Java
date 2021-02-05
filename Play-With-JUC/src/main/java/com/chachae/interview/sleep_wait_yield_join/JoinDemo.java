package com.chachae.interview.sleep_wait_yield_join;

/**
 * 1.
 * 等待调用join方法的线程结束之后，程序再继续执行，
 * 一般用于等待异步线程执行完结果之后才能继续运行的场景。
 * 例如：主线程创建并启动了子线程，如果子线程中药进行大量
 * 耗时运算计算某个数据值，而主线程要取得这个数据值才能运行，
 * 这时就要用到 join 方法了
 *
 * 2.
 * 解释一下，是主线程等待子线程的终止。也就是说主线程的代码块中，
 * 如果碰到了t.join()方法，此时主线程需要等待（阻塞），等待子线
 * 程结束了(Waits for this thread to die.),才能继续执行
 * t.join()之后的代码块。
 *
 * @author chenyuexin
 * @date 2021/2/5 11:24
 * @version 1.0
 */
public class JoinDemo {

  private static final Object obj = new Object();
  private static int count = 0;

  public static void main(String[] args) {
    Thread t1 = new Thread(new MyThread1());
    Thread t2 = new Thread(new MyThread2());
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException ignore) {
    }
    System.out.println("count:" + count);
  }

  static class MyThread1 implements Runnable {

    @Override
    public void run() {
      synchronized (obj) {
        System.out.println("thread1 start");
        for (int i = 0; i < 10; i++) {
          count++;
        }
        try {
          Thread.sleep(500);
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
        try {
          Thread.sleep(500);
        } catch (InterruptedException ignore) {
        }
        for (int i = 0; i < 10; i++) {
          count++;
        }
        System.out.println("thread2 end");
      }
    }
  }

}
