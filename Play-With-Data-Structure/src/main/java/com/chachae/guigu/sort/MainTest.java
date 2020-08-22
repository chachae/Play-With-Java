package com.chachae.guigu.sort;

import java.util.Random;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 11:49
 */
public class MainTest {

  private static int[] array = getArray();

  public static void main(String[] args) {
    MainTest mainTest = new MainTest();
    /*
     耗时：24374 ms
     耗时：2083 ms
     耗时：7 ms
     耗时：16 ms
     */
    mainTest.case1();
    mainTest.case2();
    mainTest.case3();
    mainTest.case4();
  }

  private void case1() {
    long start = System.currentTimeMillis();
    BubbleSort.sort(array);
    long end = System.currentTimeMillis();
    print(start, end);
  }

  private void case2() {
    long start = System.currentTimeMillis();
    SelectSort.sort(array);
    long end = System.currentTimeMillis();
    print(start, end);
  }

  private void case3() {
    long start = System.currentTimeMillis();
    InsertSort.sort(array);
    long end = System.currentTimeMillis();
    print(start, end);
  }

  private void case4() {
    long start = System.currentTimeMillis();
    ShellSort.sort(array);
    long end = System.currentTimeMillis();
    print(start, end);
  }

  private static void print(long start, long end) {
    System.out.printf("耗时：%s ms%n", end - start);
  }

  private static int[] getArray() {
    if (array != null) {
      return array;
    }
    array = new int[100000];
    for (int i = 0; i < 100000; i++) {
      array[i] = new Random().nextInt(100000);
    }
    return array;
  }
}
