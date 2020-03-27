package com.chachae.interview.process;

/**
 * @author chachae
 * @since 2020/3/20 22:32
 */
public class ThreadSleepProcessDemo implements Runnable {

  /**
   * Thread.sleep(millisec) 方法会休眠当前正在执行的线程，millisec 单位为毫秒。
   *
   * <p>sleep() 可能会抛出 InterruptedException，因为异常不能跨线程传播回 main() 中，
   * 因此必须在本地进行处理。线程中抛出的其它异常也同样需要在本地进行处理。
   */
  public static void main(String[] args) {
    ThreadSleepProcessDemo demo = new ThreadSleepProcessDemo();
    Thread thread = new Thread(demo);
    thread.start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("线程第 " + (i + 1) + " 次执行，耗时：" + (end - start) + " 毫秒");
      } catch (InterruptedException e) {
        System.out.println("捕获 InterruptedException 异常");
      }
    }
  }
}
