package com.chachae.leetcode.interview.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/missing-number-lcci/">面试题 17.04. 消失的数字</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 22:50
 */
public class Interview_17_04 {

  public static void main(String[] args) {
    int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    System.out.println(new Interview_17_04().missingNumber2(nums));
  }

  // 012345679
  public int missingNumber(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    Arrays.sort(nums);
    if (nums[0] != 0) {
      return 0;
    }
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      if (i < len - 1 && nums[i] + 1 != nums[i + 1]) {
        return nums[i] + 1;
      }
    }
    return nums[len - 1] + 1;
  }

  public int missingNumber2(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return nums.length * (nums.length + 1) / 2 - sum;
  }
}
