package com.chachae.algorithm.imooc.array;

/**
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/12 12:29
 */
public class MinSubArrayLen {

  public static void main(String[] args) {
    int[] nums = {2, 3, 1, 2, 4, 3};
    System.out.println(new MinSubArrayLen().minSubArrayLen(7, nums));
  }

  public int minSubArrayLen(int s, int[] nums) {
    int l = 0;
    int r = -1;
    int sum = 0;
    int res = nums.length + 1;
    while (l < nums.length) {
      if (r + 1 < nums.length && sum < s) {
        sum += nums[++r];
      } else {
        sum -= nums[l++];
      }
      if (sum >= s) {
        res = Math.min(res, r - l + 1);
      }
    }
    if (res == nums.length + 1) {
      return 0;
    }
    return res;
  }

}
