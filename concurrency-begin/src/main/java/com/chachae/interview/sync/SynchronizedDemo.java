package com.chachae.interview.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chachae
 * @since 2020/3/21 17:13
 */
public class SynchronizedDemo {

  /**
   *
   * 互斥同步tips:
   *
   * 1. Java 提供了两种锁机制来控制多个线程对共享资源的互斥访问，第一个是JVM 实现的synchronized，
   * 而另一个是JDK 实现的ReentrantLock
   *
   * 2. synchronized 同步锁，锁整个类的话，两个线程调用同一个类的不同对象上的这种同步语句，也会进行同步，
   * 锁代码块则会交叉执行
   * @see     SynchronizedDemo#fun()
   *
   * 3. synchronized 可以锁类、方法（静态方法也可以）、代码块，后两者都作用于对象
   *
   */


  private void fun() {
    // 同步锁当前代码块，main() 中的Executor 只能同步执行fun()
    synchronized (this) {
      for (int i = 0; i < 5; i++) {
        try {
          Thread.sleep(1000);
          System.out.println("[ " + (i + 1) + " ] 执行...");
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) {
    new SynchronizedDemo().syncTest();
    // new SynchronizedDemo().sync2Test();
  }

  // 一个对象，同步执行
  public void syncTest() {
    SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
    ExecutorService executorServiceA = Executors.newCachedThreadPool();
    ExecutorService executorServiceB = Executors.newCachedThreadPool();
    executorServiceA.execute(synchronizedDemo::fun);
    executorServiceB.execute(synchronizedDemo::fun);
  }

  // 两个对象，交叉执行
  public void sync2Test() {
    SynchronizedDemo e1 = new SynchronizedDemo();
    SynchronizedDemo e2 = new SynchronizedDemo();
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(e1::fun);
    executorService.execute(e2::fun);
  }
}
