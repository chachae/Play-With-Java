package com.chachae.guigu.sort;

import java.util.Arrays;

/**
 * <a href="https://www.cnblogs.com/luomeng/p/10592830.html">希尔排序</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/4 14:28
 */
public class ShellSort {

  public static void main(String[] args) {
    int[] nums = {9, 1, 2, 5, 7, 4, 8, 0, 3, 5};
    ShellSort.sort(nums);
    System.out.println(Arrays.toString(nums));
  }

  /**
   * 位移法
   */
  public static void sort(int[] arr) {
    // 增量gap, 并逐步的缩小增量
    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
      // 从第gap个元素，逐个对其所在的组进行直接插入排序
      for (int i = gap; i < arr.length; i++) {
        int j = i;
        int temp = arr[j];
        if (arr[j] < arr[j - gap]) {
          while (j - gap >= 0 && temp < arr[j - gap]) {
            //移动
            arr[j] = arr[j - gap];
            j -= gap;
          }
          //当退出while后，就给temp找到插入的位置
          arr[j] = temp;
        }
      }
    }
  }
}
