package com.chachae.design.creational.singleton;

import cn.hutool.core.thread.ThreadUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  private static final List<String> result = new ArrayList<>();

  public static void main(String[] args) throws InterruptedException {
    selector(0);
    for (int i = 0; i < 5; i++) {
      long start = System.currentTimeMillis();
      selector(i);
      long end = System.currentTimeMillis();
      result.add(String.format("%s ms", (end - start)));
      TimeUnit.SECONDS.sleep(2);
    }

    result.forEach(System.out::println);
  }

  private static void selector(int index) {
    switch (index) {
      case 0:
        lazySingletonTestCase();
        break;
      case 1:
        hungrySingletonTestCase();
        break;
      case 2:
        innerClassSingletonTestCase();
      case 3:
        lock2SingletonTestCase();
        break;
      case 4:
        enumSingletonTestCase();
        break;
    }
  }

  private static void lazySingletonTestCase() {
    final ExecutorService executor = ThreadUtil.newExecutor(20);
    try {
      for (int i = 0; i < 1000; i++) {
        executor.execute(() -> System.out.println(LazySingleton.getInstance().toString()));
      }
    } finally {
      executor.shutdown();
    }
  }

  private static void hungrySingletonTestCase() {
    final ExecutorService executor = ThreadUtil.newExecutor(20);
    try {
      for (int i = 0; i < 1000; i++) {
        executor.execute(() -> System.out.println(HungrySingleton.getInstance().toString()));
      }
    } finally {
      executor.shutdown();
    }
  }

  private static void innerClassSingletonTestCase() {
    final ExecutorService executor = ThreadUtil.newExecutor(20);
    try {
      for (int i = 0; i < 1000; i++) {
        executor.execute(() -> System.out.println(InnerClassSingleton.getInstance().toString()));
      }
    } finally {
      executor.shutdown();
    }
  }

  private static void lock2SingletonTestCase() {
    final ExecutorService executor = ThreadUtil.newExecutor(20);
    try {
      for (int i = 0; i < 1000; i++) {
        executor.execute(() -> System.out.println(Lock2Singleton.getInstance().toString()));
      }
    } finally {
      executor.shutdown();
    }
  }

  private static void enumSingletonTestCase() {
    final ExecutorService executor = ThreadUtil.newExecutor(20);
    try {
      for (int i = 0; i < 1000; i++) {
        executor.execute(() -> System.out.println(EnumSingleton.getInstance().toString()));
      }
    } finally {
      executor.shutdown();
    }
  }
}
