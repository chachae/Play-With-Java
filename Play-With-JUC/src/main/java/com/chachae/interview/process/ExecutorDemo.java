package com.chachae.interview.process;

import com.chachae.interview.simple.SimpleThreadWithRunnableDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chachae
 * @since 2020/3/20 22:24
 */
public class ExecutorDemo {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++) {
      executorService.execute(new SimpleThreadWithRunnableDemo());
    }

    // 关闭ExecutorService 实例
    executorService.shutdown();
  }
}
