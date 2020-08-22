package com.chachae.guigu.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 10:03
 */
public class InsertSort {

  public static void main(String[] args) {
    int[] nums = {6, 2, 8, 0, -3, 1};
    InsertSort.sort(nums);
    System.out.println(Arrays.toString(nums));
  }

  // 6 2 8 0 8 1
  public static void sort(int[] array) {
    if (array == null || array.length < 2) {
      return;
    }
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int leftIndex = i - 1;
      while (leftIndex >= 0 && array[leftIndex] > temp) {
        array[leftIndex + 1] = array[leftIndex];
        leftIndex--;
      }
      array[leftIndex + 1] = temp;
    }
  }
}
