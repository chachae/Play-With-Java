package com.chachae.guigu.search;

/**
 * 插值查找
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/8 10:40
 */
public class InsertValueSearch {

  public static void main(String[] args) {
    int[] nums = new int[30];
    for (int i = 1; i <= 30; i++) {
      nums[i - 1] = i;
    }
    System.out.println(search(nums, 1));
  }

  public static int search(int[] array, int value) {
    return array == null ? -1 : search(array, value, 0, array.length - 1);
  }

  private static int search(int[] array, int value, int left, int right) {
    if (left > right) {
      return -1;
    }

    int mid = left + (value - array[left]) / (array[right] - array[left]) * (right - left);
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
