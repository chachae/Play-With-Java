package com.chachae.leetcode.Offer_56_I;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chachae
 * @date 2020/10/13 21:38
 * @version v1.0
 */
class Solution {

  public int[] singleNumbers(int[] nums) {
    int[] ans = new int[2];
    Map<Integer, Integer> records = new HashMap<>();
    for (int num : nums) {
      records.put(num, records.getOrDefault(num, 0) + 1);
    }
    int i = 0;
    for (Map.Entry<Integer, Integer> entry : records.entrySet()) {
      if (entry.getValue() == 1) {
        ans[i++] = entry.getKey();
      }
    }
    return ans;
  }
}