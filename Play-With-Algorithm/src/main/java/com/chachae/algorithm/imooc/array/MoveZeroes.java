package com.chachae.algorithm.imooc.array;

import java.util.Arrays;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/11 23:29
 */
public class MoveZeroes {

  public static void main(String[] args) {
    int[] nums = {1, 1, 0, 3, 12, 0, 9, 0, 1, 2, 0, 8, 1};
    new MoveZeroes().moveZeros2(nums);
    System.out.println(Arrays.toString(nums));
  }

  public void moveZeros(int[] nums) {
    int f = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[f++] = nums[i];
      }
    }
    for (int i = f; i < nums.length; i++) {
      nums[i] = 0;
    }
  }

  public void moveZeros2(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (k != i) {
          nums[k] = nums[i];
          nums[i] = 0;
        }
        k++;
      }
    }
  }
}
