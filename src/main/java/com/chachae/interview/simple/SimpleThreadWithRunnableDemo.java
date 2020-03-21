package com.chachae.interview.simple;

/**
 * 简单使用线程（实现）
 *
 * @author chachae
 * @since 2020/3/20 21:18
 */
public class SimpleThreadWithRunnableDemo implements Runnable {

  @Override
  public void run() {
    System.out.println("实现 [Runnable] 线程启动");
  }

  public static void main(String[] args) {
    SimpleThreadWithRunnableDemo instance = new SimpleThreadWithRunnableDemo();
    Thread thread = new Thread(instance);
    thread.start();
  }
}
