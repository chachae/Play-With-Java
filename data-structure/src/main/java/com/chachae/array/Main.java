package com.chachae.array;

/**
 * @author chachae
 * @since 2020/4/7 15:47
 */
public class Main {

  public static void main(String[] args) {
    test();
  }

  public static void test() {
    // 初始化 5 个元素容量的数组
    Array<Integer> array = new Array<>(10);
    // 插入式条数据
    for (int i = 1; i <= 100; i++) {
      array.add(i);
    }
    // 索引 0 替换成 1
    array.add(9, 10);
    // 末尾追加 2
    array.add(2);
    System.out.println(array.toString());
    // 移除索引10元素
    array.remove(10);
    System.out.println(array.toString());
    // 移除前8个元素
    for (int i = 0; i < 80; i++) {
      array.remove(0);
    }
    System.out.println(array.toString());
  }

  public static void test2() {
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }

    for (int i : arr) {
      System.out.printf("%d\t", i);
    }
    System.out.println();

    int[] arr2 = new int[] {1, 2, 3};
    for (int i : arr2) {
      System.out.printf("%d\t", i);
    }
    System.out.println();

    arr2[2] = 6;
    for (int i : arr2) {
      System.out.printf("%d\t", i);
    }
  }
}
