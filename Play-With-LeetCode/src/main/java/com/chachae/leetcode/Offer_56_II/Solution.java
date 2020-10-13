package com.chachae.leetcode.Offer_56_II;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chachae
 * @date 2020/10/13 21:38
 * @version v1.0
 */
class Solution {

  public int singleNumber(int[] nums) {
    int ans = 0;
    Map<Integer, Integer> records = new HashMap<>();
    for (int num : nums) {
      records.put(num, records.getOrDefault(num, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : records.entrySet()) {
      if (entry.getValue() == 1) {
        ans = entry.getKey();
        break;
      }
    }
    return ans;
  }
}