package com.chachae.guigu.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/3 20:57
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = {1, 8, 4, -10, 9, -4, 5, 0, 200, 101, -5};
    BubbleSort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr) {
    int temp;
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          flag = true;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if (!flag) {
        break;
      } else {
        flag = false;
      }
    }
  }
}
