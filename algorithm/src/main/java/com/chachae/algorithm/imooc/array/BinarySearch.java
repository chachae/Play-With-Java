package com.chachae.algorithm.imooc.array;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/11 23:19
 */
public class BinarySearch {

  public static void main(String[] args) {
    int[] nums = new int[100];
    for (int i = 1; i <= 100; i++) {
      nums[i - 1] = i;
    }

    System.out.println(search(nums, 100));
  }

  public static int search(int[] array, int target) {
    return search(0, array.length - 1, array, target);
  }

  private static int search(int start, int end, int[] array, int target) {
    if (start <= end) {
      int mid = (start + end) >> 1;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] > target) {
        return search(start, mid - 1, array, target);
      } else {
        return search(mid + 1, end, array, target);
      }
    } else {
      return -1;
    }
  }

}
