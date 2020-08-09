package com.chachae.guigu.queue;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 12:06
 */
public class MainTest {

  public static void main(String[] args) {
    // testArray();
    testCircleQueue();
  }

  private static void testArray() {
    Queue<String> queue = new ArrayQueue<>(1);
    queue.add("abs");
    System.out.println(queue.peek());
    queue.poll();
    queue.add("sss");
    queue.add("yyy");
  }

  private static void testCircleQueue() {
    Queue<String> queue = new CircleArrayQueue<>(2);
    queue.add("abs");
    System.out.println(queue.poll());
    queue.add("sss");
    queue.add("xxx");
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}
