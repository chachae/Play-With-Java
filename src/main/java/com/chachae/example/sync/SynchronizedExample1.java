package com.chachae.example.sync;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

/**
 * @author chachae
 * @date 2019/9/17 18:33
 */
@Slf4j
public class SynchronizedExample1 {

  /** 修饰代码块 */
  private void test1() {
    synchronized (this) {
      for (int i = 0; i < 10; i++) {
        log.info("test 1 - {}", i);
      }
    }
  }

  /** 修饰方法 */
  private synchronized void test2() {
    for (int i = 0; i < 10; i++) {
      log.info("test 2 - {}", i);
    }
  }

  public static void main(String[] args) {

    SynchronizedExample1 sync = new SynchronizedExample1();
    SynchronizedExample1 sync2 = new SynchronizedExample1();
    ExecutorService executorService = ThreadUtil.newExecutor();
    // 使用线程池的话是使用两个线程去执行同一个方法，可以验证synchronized
    executorService.execute(sync::test1);
    executorService.execute(sync2::test1);
  }
}
