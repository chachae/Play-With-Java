package com.chachae.leetcode.interview.array;

/**
 * <A HREF="https://leetcode-cn.com/problems/majority-element/comments/">169. 多数元素</A>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 23:28
 */
public class No169 {

  public static void main(String[] args) {
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(new No169().majorityElement(nums));
  }

  public int majorityElement(int[] nums) {
    int ref = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == ref) {
        count++;
      } else if (--count == 0) {
        ref = nums[i+1];
      }
    }
    return ref;
  }
}
