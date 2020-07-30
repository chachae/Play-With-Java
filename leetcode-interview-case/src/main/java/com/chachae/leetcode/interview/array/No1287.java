package com.chachae.leetcode.interview.array;

/**
 * <a href="https://leetcode-cn.com/problems/element-appearing-more-than-25-in-sorted-array/">1287.
 * 有序数组中出现次数超过25%的元素</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 22:04
 */
public class No1287 {

  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 3, 3, 3};
    System.out.println(new No1287().findSpecialInteger(nums));
  }

  public int findSpecialInteger(int[] arr) {
    for (int i = 0, len = arr.length / 4; i < arr.length - len; i++) {
      if (arr[i] == arr[i + len]) {
        return arr[i];
      }
    }
    return arr[0];
  }
}
