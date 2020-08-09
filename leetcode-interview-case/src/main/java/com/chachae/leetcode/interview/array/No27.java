package com.chachae.leetcode.interview.array;

import java.util.Arrays;

/**
 * <A href="https://leetcode-cn.com/problems/remove-element/">27. 移除元素</A>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/31 23:01
 */
public class No27 {

  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
    System.out.println(new No27().removeElement2(nums, 3));
  }

  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      int cur = nums[i];
      if (cur != val) {
        nums[res++] = nums[i];
      }
    }
    return res;
  }

  /**
   * 递归+双指针
   */
  public int removeElement2(int[] nums, int val) {
    return remove(nums, val, 0, 0);
  }

  private int remove(int[] nums, int val, int slow, int fast) {
    if (fast == nums.length) {
      return slow;
    }
    return nums[fast] == val ? remove(nums, val, slow, ++fast) : remove(nums, val, ++slow, ++fast);
  }
}
