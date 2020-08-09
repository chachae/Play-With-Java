package com.chachae.leetcode.interview.array;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/move-zeroes/">283. 移动零</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 19:42
 */
public class No283 {

  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    new No283().moveZeroes(nums);
  }

  public void moveZeroes(int[] nums) {
    if (nums.length <= 1) {
      return;
    }

    int slow = 0;
    int fast = 1;

    for (int i = 0; i < nums.length; i++) {
      if (fast + 1 <= nums.length) {
        if (nums[slow] == 0 && nums[fast] != 0) {
          int temp = nums[fast];
          nums[slow] = temp;
          nums[fast] = 0;
          slow++;
          fast++;
        } else if (nums[i] == 0 && nums[fast] == 0) {
          fast++;
        } else {
          slow++;
        }
      }
    }
  }
}
