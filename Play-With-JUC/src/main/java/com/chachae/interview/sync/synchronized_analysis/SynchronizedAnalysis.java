package com.chachae.interview.sync.synchronized_analysis;

import java.util.concurrent.TimeUnit;

/**
 * @author chenyuexin
 * @date 2021/2/5 13:39
 * @version 1.0
 */
public class SynchronizedAnalysis {

  public static void main(String[] args) throws Exception {
    testLockCodeBlockCurrentCase();
  }

  public static void testLockStaticMethod() {
    new Thread(() -> {
      try {
        SynchronizedAnalysis.lockStaticMethod();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t1").start();

    new Thread(() -> {
      try {
        SynchronizedAnalysis.lockStaticMethod();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t2").start();
  }

  public static void testLockCaseMethod() throws Exception {
    SynchronizedAnalysis sync1 = new SynchronizedAnalysis();
    SynchronizedAnalysis sync2 = new SynchronizedAnalysis();
    new Thread(() -> {
      try {
        sync1.lockCaseMethod();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t1").start();

    new Thread(() -> {
      try {
        sync2.lockCaseMethod();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t2").start();
  }

  public static void testLockCodeBlockCurrentCase() throws Exception {
    SynchronizedAnalysis sync1 = new SynchronizedAnalysis();
    SynchronizedAnalysis sync2 = new SynchronizedAnalysis();
    new Thread(() -> {
      try {
        sync1.lockCodeBlockCurrentCase();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t1").start();

    new Thread(() -> {
      try {
        sync1.lockCodeBlockCurrentCase();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }, "t2").start();
  }

  public static void testLockCodeBlockCurrentClass() throws Exception {

  }

  public static synchronized void lockStaticMethod() throws Exception {
    TimeUnit.SECONDS.sleep(2L);
    System.out.println("staticMethodTest working");
  }

  public synchronized void lockCaseMethod() throws Exception {
    TimeUnit.SECONDS.sleep(2L);
    System.out.println("caseMethodTest working");
  }

  public void lockCodeBlockCurrentCase() throws Exception {
    System.out.println("lockCodeBlockCurrentCaseTest working");
    synchronized (this) {
      TimeUnit.SECONDS.sleep(2L);
      System.out.println("lockCodeBlockCurrentCaseTest code block lock");
    }
  }

  public void lockCodeBlockCurrentClass() throws Exception {
    System.out.println("lockCodeBlockCurrentClassTest working");
    synchronized (SynchronizedAnalysis.class) {
      TimeUnit.SECONDS.sleep(2L);
      System.out.println("lockCodeBlockCurrentClassTest code block lock");
    }
  }
}
