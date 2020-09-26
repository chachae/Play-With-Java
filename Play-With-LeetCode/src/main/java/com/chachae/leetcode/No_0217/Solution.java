package com.chachae.leetcode.No_0217;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> record = new HashMap<>();
    for (int num : nums) {
      record.put(num, record.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
      if (entry.getValue() >= 2) {
        return true;
      }
    }
    return false;
  }
}