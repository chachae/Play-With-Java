package com.chachae.interview.juc.other;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTask 可用于异步获取执行结果或取消执行任务的场景。当一个计算任务需要执行很长时间， 那么就可以用 FutureTask 来封装这个任务，主线程在完成自己的任务之后再去获取结果。
 *
 * @author chachae
 * @since 2020/3/22 11:45
 */
public class FutureTaskDemo {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    // 模拟异步计算任务
    FutureTask<Integer> futureTask =
        new FutureTask<>(
            () -> {
              int result = 0;
              long start = System.currentTimeMillis();
              for (int i = 1; i <= 100; i++) {
                result += i;
                Thread.sleep(100);
              }
              long end = System.currentTimeMillis();
              System.out.println("运行耗时：" + (end - start) / 1000 + " 秒");
              return result;
            });

    Thread taskThread = new Thread(futureTask);
    taskThread.start();

    // 模拟主线程
    Thread mainThread = new Thread(() -> System.out.println("模拟主线程"));
    mainThread.start();

    // 获取异步任务结果
    System.out.println("任务结果：" + futureTask.get());
  }
}
