package com.chachae.guigu.search;

/**
 * 二分查找
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/8 10:40
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] nums = {1, 5, 6, 7, 8, 9, 11, 13, 17, 88, 90, 100, 204};
    System.out.println(search(nums, 90));
  }

  public static int search(int[] array, int value) {
    return array == null ? -1 : search(array, value, 0, array.length - 1);
  }

  private static int search(int[] array, int value, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = (left + right) >> 1;
    int midValue = array[mid];
    if (midValue < value) {
      return search(array, value, mid + 1, right);
    } else if (midValue > value) {
      return search(array, value, left, mid - 1);
    } else {
      return mid;
    }
  }
}
