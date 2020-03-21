package com.chachae.interview.cooperate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * wait() notify() notifyAll() 调用 wait() 使得线程等待某个条件满足，线程在等待时会被挂起，当其他线程的运行使得这个条件满足时，其它线程会调用 notify()
 * 或者 notifyAll() 来唤醒挂起的线程。
 *
 * <p>它们都属于 Object 的一部分，而不属于 Thread。
 *
 * <p>只能用在同步方法或者同步控制块中使用，否则会在运行时抛出 IllegalMonitorStateException。
 *
 * <p>使用 wait() 挂起期间，线程会释放锁。这是因为，如果没有释放锁，那么其它线程就无法进入对象的同步方法或者同步控制块中，那么就无法执行 notify() 或者 notifyAll()
 * 来唤醒挂起的线程，造成死锁。
 *
 * @author chachae
 * @since 2020/3/21 21:43
 */
public class ThreadWaitAndNoticeDemo {

  synchronized void B() {
    System.out.println("B");
    // 唤醒挂起的线程
    notifyAll();
  }

  synchronized void A() {
    try {
      // 挂起，wait 会释放锁，sleep 不会
      wait();
      System.out.println("A");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ThreadWaitAndNoticeDemo demo = new ThreadWaitAndNoticeDemo();
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(demo::A);
    executorService.execute(demo::B);
  }
}
