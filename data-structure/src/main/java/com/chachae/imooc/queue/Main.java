package com.chachae.imooc.queue;

import java.util.Random;

/**
 * @author chachae
 * @since 2020/4/7 22:08
 */
public class Main {

  public static void main(String[] args) {
    // arrayQueueTest();
    // loopQueueTest();

    int opCount = 100000;

    LoopQueue<Integer> loopQueue = new LoopQueue<>();
    double time2 = testQueue(loopQueue, opCount);
    System.out.println("LoopQueue, time: " + time2 + " s");

    ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
    double time1 = testQueue(arrayQueue, opCount);
    System.out.println("ArrayQueue, time: " + time1 + " s");
  }

  public static void arrayQueueTest() {

    ArrayQueue<Integer> queue = new ArrayQueue<>();
    for (int i = 0; i < 10; i++) {
      queue.enqueue(i);
      System.out.println(queue);
      if (i % 3 == 2) {
        queue.dequeue();
        System.out.println(queue);
      }
    }
  }

  public static void loopQueueTest() {

    LoopQueue<Integer> queue = new LoopQueue<>();
    for (int i = 0; i < 20; i++) {
      queue.enqueue(i);
      System.out.println(queue);

      if (i % 3 == 2) {
        queue.dequeue();
        System.out.println(queue);
      }
    }
  }

  // 测试使用q运行opCount个enqueueu和dequeue操作所需要的时间，单位：秒
  private static double testQueue(Queue<Integer> q, int opCount) {

    long startTime = System.nanoTime();

    Random random = new Random();
    for (int i = 0; i < opCount; i++) {
      q.enqueue(random.nextInt(Integer.MAX_VALUE));
    }
    for (int i = 0; i < opCount; i++) {
      q.dequeue();
    }

    long endTime = System.nanoTime();

    return (endTime - startTime) / 1000000000.0;
  }
}
