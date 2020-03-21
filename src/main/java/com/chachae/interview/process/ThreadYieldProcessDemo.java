package com.chachae.interview.process;

/**
 * @author chachae
 * @since 2020/3/20 22:32
 */
public class ThreadYieldProcessDemo implements Runnable {

  public static void main(String[] args) {
    // do something......
  }

  /**
   * 对静态方法 Thread.yield() 的调用声明了当前线程已经完成了生命周期中最重要的部分， <br>
   * 可以切换给其它线程来执行。该方法只是对线程调度器的一个建议，而且也只是建议具有相 <br>
   * 同优先级的其它线程可以运行。
   */
  @Override
  public void run() {
    Thread.yield();
  }
}
