package com.chachae.algorithm.imooc.array;

import java.util.Arrays;

/**
 * 对撞指针 - 双索引
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 11:42
 */
public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {1, 3, 6, 7, 8, 9, 10, 13, 17, 18, 19, 25};
    System.out.println(Arrays.toString(new TwoSum().twoSum(nums, 25)));
  }

  public int[] twoSum(int[] numbers, int target) {
    int a = 0;
    int b = numbers.length - 1;
    while (a < b) {
      if (numbers[a] + numbers[b] == target) {
        return new int[]{a + 1, b + 1};
      } else if (numbers[a] + numbers[b] > target) {
        b--;
      } else {
        a++;
      }
    }
    return new int[0];
  }
}
