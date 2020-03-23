package com.chachae.interview.juc.other;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * ForkJoin 使用 ForkJoinPool 来启动，它是一个特殊的线程池，线程数量取决于 CPU 核数。
 *
 * <p>public class ForkJoinPool extends AbstractExecutorService ForkJoinPool 实现了工作窃取算法来提高 CPU
 *
 * <p>的利用率。每个线程都维护了一个双端队列，用来存储需要执行的任务。工作窃取算法允许空闲的线程从其它线程的双端队列中
 *
 * <p>窃取一个任务来执行。窃取的任务必须是最晚的任务，避免和队列所属线程发生竞争。例如下图中，Thread2 从 Thread1
 *
 * <p>的队列中拿出最晚的 Task1 任务，Thread1 会拿出 Task2 来执行，这样就避免发生竞争。但是如果队列中只有一个任务时还是会发生竞争。
 *
 * @author chachae
 * @since 2020/3/22 14:39
 */
public class ForkJoinDemo extends RecursiveTask<Integer> {

  private static final Integer HOLDER = 100;
  private Integer start;
  private Integer end;

  public ForkJoinDemo(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  protected Integer compute() {
    int result = 0;
    // 足够小（在小任务的阈值范围内）
    if (end - start <= HOLDER) {
      for (int i = start; i <= end; i++) {
        result += i;
      }
    } else {
      // 拆分成小任务
      int middle = start + (end - start) / 2;
      ForkJoinDemo leftTask = new ForkJoinDemo(start, middle);
      ForkJoinDemo rightTask = new ForkJoinDemo(middle + 1, end);
      leftTask.fork();
      rightTask.fork();
      result = leftTask.join() + rightTask.join();
    }
    return result;
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ForkJoinDemo example = new ForkJoinDemo(1, 10000);
    ForkJoinPool forkJoinPool = new ForkJoinPool();
    ForkJoinTask<Integer> result = forkJoinPool.submit(example);
    System.out.println(result.get());
  }
}
