package com.chachae.interview.sync;

import java.util.concurrent.TimeUnit;

/**
 * 线程八锁的关键：
 * ①非静态方法的锁默认为  this,  静态方法的锁为 对应的 Class 实例
 * ②某一个时刻内，只能有一个线程持有锁，无论几个方法。
 *
 * @author chachae
 * @since 2020/3/24 16:39
 */
class Phone {

  public synchronized void sendEmail() {
    try {
      TimeUnit.SECONDS.sleep(2);
      System.out.println(Thread.currentThread().getName() + "：发邮件");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public synchronized void sendSMS() {
    System.out.println(Thread.currentThread().getName() + "：发短信");
  }

  public static synchronized void sendPhoto() {
    try {
      TimeUnit.SECONDS.sleep(2);
      System.out.println(Thread.currentThread().getName() + "：发图片");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void sayHello() {
    System.out.println(Thread.currentThread().getName() + "：你好");
  }
}

class Main2 {

  public static void main(String[] args) {

    Phone android = new Phone();
    Phone iphone = new Phone();

    new Thread(
            () -> {
              // Phone.sendPhoto();
              android.sendEmail();
            },
            "StudentA")
        .start();

    new Thread(
            () -> {
              // Phone.sendPhoto();
              android.sayHello();
            },
            "StudentB")
        .start();
  }
}
