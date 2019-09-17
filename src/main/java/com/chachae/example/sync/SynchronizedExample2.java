package com.chachae.example.sync;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

/**
 * @author chachae
 * @date 2019/9/17 18:33
 */
@Slf4j
public class SynchronizedExample2 {

  /** 对比案例1，我们可以知道，被synchronized所修饰的类和方法所得掉的结果是一样的 */
  private void test1() {
    /*
    修饰类
     */
    synchronized (SynchronizedExample2.class) {
      for (int i = 0; i < 10; i++) {
        log.info("test 1 - {}", i);
      }
    }
  }

  /*
  修饰方法
   */
  private synchronized void test2() {
    for (int i = 0; i < 10; i++) {
      log.info("test 1 - {}", i);
    }
  }

  public static void main(String[] args) {

    SynchronizedExample2 sync = new SynchronizedExample2();
    SynchronizedExample2 sync2 = new SynchronizedExample2();
    ExecutorService executorService = ThreadUtil.newExecutor();
    executorService.execute(sync::test1);
    executorService.execute(sync2::test1);
  }
}
