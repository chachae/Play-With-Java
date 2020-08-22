package com.chachae.guigu.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/3 22:45
 */
public class SelectSort {

  public static void main(String[] args) {
    int[] arr = {1, 8, 4, -10, 9, -4, 5, 0, 200, 101, -5};
    SelectSort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int minIndex = 0;
    int min = arr[0];
    // 比较 length-1 次
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          minIndex = j;
        }
      }
      if (minIndex != i) {
        arr[minIndex] = arr[i];
        arr[i] = min;
      }
      minIndex = i + 1;
      min = arr[minIndex];
    }
  }
}
