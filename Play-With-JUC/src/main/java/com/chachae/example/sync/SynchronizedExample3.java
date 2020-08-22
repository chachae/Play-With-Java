package com.chachae.example.sync;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

/**
 * @author chachae
 * @date 2019/9/17 18:33
 */
@Slf4j
public class SynchronizedExample3 {

  /** 对比案例1，我们可以知道，被synchronized所修饰的类和方法所得掉的结果是一样的 */
  private void test1(int j) {
    /*
    修饰类【同步代码块】
     */
    synchronized (SynchronizedExample3.class) {
      for (int i = 0; i < 10; i++) {
        log.info("test 1 - {} - {}", i, j);
      }
    }
  }

  /** 修饰一个静态方法 */
  private static synchronized void test2(int j) {
    for (int i = 0; i < 10; i++) {
      log.info("test 2 - {} - {}", i, j);
    }
  }

  public static void main(String[] args) {

    SynchronizedExample3 sync = new SynchronizedExample3();
    SynchronizedExample3 sync2 = new SynchronizedExample3();
    ExecutorService executorService = ThreadUtil.newExecutor();
    executorService.execute(() -> sync.test1(1));
    executorService.execute(() -> test2(1));
  }
}
