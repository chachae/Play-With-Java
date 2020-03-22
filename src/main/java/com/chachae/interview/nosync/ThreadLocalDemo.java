package com.chachae.interview.nosync;

/**
 * ThreadLocal 从理论上讲并不是用来解决多线程并发问题的，因为根本不存在多线程竞争。
 *
 * <p>在一些场景 (尤其是使用线程池) 下，由于 ThreadLocal.ThreadLocalMap 的底层数据结构导致 ThreadLocal 有内存泄漏的情况，应该尽可能在每次使用
 * ThreadLocal 后手动调用 remove()，以避免出现 ThreadLocal 经典的内存泄漏甚至是造成自身业务混乱的风险。
 *
 * @author chachae
 * @since 2020/3/22 17:11
 */
public class ThreadLocalDemo {

  public static void main(String[] args) {
    ThreadLocal threadLocal = new ThreadLocal();
    Thread thread1 =
        new Thread(
            () -> {
              threadLocal.set(1);
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              System.out.println(threadLocal.get());
              threadLocal.remove();
            });
    Thread thread2 =
        new Thread(
            () -> {
              threadLocal.set(2);
              threadLocal.remove();
            });
    thread1.start();
    thread2.start();
  }
}
