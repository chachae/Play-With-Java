package com.chachae.interview.thread_pool;

import java.util.Date;

/**
 *
 * @author chachae
 * @date 2020/10/22 16:24
 * @version v1.0
 */
public class MyRunnable implements Runnable {

  private final String command;

  public MyRunnable(String s) {
    this.command = s;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " Start.Time = " + new Date());
    processCommand();
    System.out.println(Thread.currentThread().getName() + " End.Time = " + new Date());
  }

  private void processCommand() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    return this.command;
  }
}