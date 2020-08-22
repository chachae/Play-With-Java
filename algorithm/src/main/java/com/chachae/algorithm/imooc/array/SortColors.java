package com.chachae.algorithm.imooc.array;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sort-colors/comments/ 三路思想
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 10:59
 */
public class SortColors {

  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 0, 0, 1, 0, 2, 1, 2, 2};
    new SortColors().sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }

  public void sortColors(int[] nums) {
    int zero = -1;
    int two = nums.length;
    for (int i = 0; i < two; ) {
      if (nums[i] == 0) {
        swap(++zero, i++, nums);
      } else if (nums[i] == 1) {
        i++;
      } else {
        swap(--two, i, nums);
      }
    }
  }

  private void swap(int index1, int index2, int[] array) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
