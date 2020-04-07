package com.chachae.queue;

/**
 * @author chachae
 * @since 2020/4/7 22:08
 */
public class Main {

  public static void main(String[] args) {
    // arrayQueueTest();
    loopQueueTest();
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
    for (int i = 0; i < 10; i++) {
      queue.enqueue(i);
      System.out.println(queue);

      if (i % 3 == 2) {
        queue.dequeue();
        System.out.println(queue);
      }
    }
  }
}
