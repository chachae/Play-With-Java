package com.chachae.leetcode.Offer_39;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public static void main(String[] args) {
    int[] nums = {6, 5, 5};
    System.out.println(new Solution().majorityElement(nums));
  }

  public int majorityElement(int[] nums) {
    int len = nums.length;
    int less = len % 2 == 0 ? len / 2 : len / 2 + 1;
    Map<Integer, Integer> record = new HashMap<>();
    for (int num : nums) {
      record.put(num, record.getOrDefault(num, 0) + 1);
      if (less == record.get(num)) {
        return num;
      }
    }
    return -1;
  }
}