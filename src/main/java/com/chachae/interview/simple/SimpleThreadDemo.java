package com.chachae.interview.simple;

/**
 * 继承Thread 类
 *
 * @author chachae
 * @since 2020/3/20 21:31
 */
public class SimpleThreadDemo extends Thread {

  public static void main(String[] args) {
    SimpleThreadDemo instance = new SimpleThreadDemo();
    instance.start();
  }

  @Override
  public void run() {
    System.out.println("继承 [Thread] 启动线程");
  }
}
