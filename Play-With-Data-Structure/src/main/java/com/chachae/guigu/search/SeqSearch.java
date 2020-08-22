package com.chachae.guigu.search;

/**
 * 线性查找
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/8 10:30
 */
public class SeqSearch {

  public static void main(String[] args) {
    int[] nums = {24, 56, 7, 9, 0, 6, 3, 1, 4, 67, 8, 5, -9, 12, 4};
    System.out.println(search(nums, 8));
  }

  public static int search(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
