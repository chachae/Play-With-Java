package com.chachae.interview.process;

import com.chachae.interview.simple.SimpleThreadDemo;
import com.chachae.interview.simple.SimpleThreadWithRunnableDemo;

/**
 * @author chachae
 * @since 2020/3/20 22:32
 */
public class ThreadDaemonProcessDemo {

  /**
   * Daemon 守护线程是程序运行时在后台提供服务的线程，不属于程序中不可或缺的部分。
   *
   * <p>当所有非守护线程结束时，程序也就终止，同时会杀死所有守护线程。
   *
   * <p>main() 属于非守护线程。
   *
   * <p>在线程启动之前使用 setDaemon() 方法可以将一个线程设置为守护线程。
   */
  public static void main(String[] args) {
    Thread thread = new Thread(new SimpleThreadWithRunnableDemo());
    SimpleThreadDemo instance = new SimpleThreadDemo();
    // 设置thread 为守护线程
    thread.setDaemon(true);
    thread.start();
    instance.start();
  }
}
