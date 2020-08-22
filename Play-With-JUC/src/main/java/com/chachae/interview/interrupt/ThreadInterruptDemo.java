package com.chachae.interview.interrupt;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程中断
 *
 * @author chachae
 * @since 2020/3/20 23:12
 */
public class ThreadInterruptDemo extends Thread {

  @Test
  public void threadInterruptTest() {
    ThreadInterruptDemo demo = new ThreadInterruptDemo();
    // 启动线程
    demo.start();
    // 销毁
    demo.interrupt();
  }

  /**
   * 调用 Executor 的 shutdown() 方法会等待线程都执行完毕之后再关闭<br>
   * ，但是如果调用的是 shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法。
   */
  @Test
  public void executorInterruptTest() {
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(
        () -> {
          try {
            Thread.sleep(2000);
            System.out.println("Thread run");
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        });
    // executorService.shutdown();
    executorService.shutdownNow();
    // 抛出异常
    System.out.println("Main run");
  }
  /**
   * 如果只想中断 Executor 中的一个线程，可以通过使用 submit() 方法来提交一个线程，<br>
   * 它会返回一个 Future<?> 对象，通过调用该对象的 cancel(true) 方法就可以中断线程。
   */
  @Test
  public void executorSubmitTest() {
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(
        () -> {
          try {
            Thread.sleep(5000);
            System.out.println("Thread run");
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        });

    Future<?> future = executorService.submit(() -> {});
    future.cancel(true);
    System.out.println("Main run");
  }

  @Override
  public void run() {
    try {
      // 休眠5秒
      Thread.sleep(5000);
      System.out.println("线程执行成功");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
