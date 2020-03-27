package com.chachae.interview.cooperate;

import org.junit.jupiter.api.Test;

/**
 * @author chachae
 * @since 2020/3/21 21:21
 */
public class ThreadJoinDemo {

  private class B extends Thread {

    @Override
    public void run() {
      System.out.println("B");
    }
  }

  private class A extends Thread {

    private B b;

      /**
       * 构造方法
       */
    public A(B b) {
      this.b = b;
    }

    @Override
    public void run() {
      try {
        // 调用B 的 join() 方法
        b.join();
        System.out.println("A");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /** Output: B A */
  @Test
  public void test() {
    B b = new B();
    A a = new A(b);
    a.start();
    b.start();
  }
}
