package com.chachae.leetcode.No_1114;

import java.util.concurrent.Semaphore;

/**
 * https://leetcode-cn.com/problems/print-in-order/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Foo {

  public Semaphore a = new Semaphore(0);

  public Semaphore b = new Semaphore(0);

  public Foo() {

  }

  public void first(Runnable printFirst) throws InterruptedException {
    printFirst.run();
    a.release();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    a.acquire();
    printSecond.run();
    b.release();
  }

  public void third(Runnable printThird) throws InterruptedException {
    b.acquire();
    printThird.run();
  }
}