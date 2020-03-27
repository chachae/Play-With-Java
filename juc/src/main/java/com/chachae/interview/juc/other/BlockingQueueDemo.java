package com.chachae.interview.juc.other;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author chachae
 * @since 2020/3/22 12:07
 */
public class BlockingQueueDemo {

  private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

  class Consumer extends Thread {
    @Override
    public void run() {
      try {
        queue.take();
        System.out.println("Consumer");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  class Producer extends Thread {
    @Override
    public void run() {
      queue.add(1);
      System.out.println("Producer");
    }
  }

  @Test
  public void test() {
    for (int i = 0; i < 2; i++) {
      Producer producer = new Producer();
      producer.start();
    }
    for (int i = 0; i < 5; i++) {
      Consumer consumer = new Consumer();
      consumer.start();
    }
    for (int i = 0; i < 3; i++) {
      Producer producer = new Producer();
      producer.start();
    }
  }
}
