package com.chachae.interview.simple;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable 接口
 *
 * @author chachae
 * @since 2020/3/20 21:31
 */
public class SimpleThreadWithCallableDemo implements Callable<Integer> {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    SimpleThreadWithCallableDemo instance = new SimpleThreadWithCallableDemo();
    FutureTask<Integer> ft = new FutureTask<>(instance);
    Thread thread = new Thread(ft);
    thread.start();
    System.out.println(ft.get());
  }

  @Override
  public Integer call() {
    return 10;
  }
}
