package com.chachae.jvm;

/**
 * 本地接口（Native）
 *
 * @author chachae
 * @since 2020/3/26 11:38
 */
public class Native {

  public static void main(String[] args) {
    Thread t1 = new Thread();
    t1.start();
    t1.start(); // java.lang.IllegalThreadStateException
  }
}
