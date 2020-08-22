package com.chachae.algorithm.imooc.search;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/18 16:49
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> record = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int b = target - nums[i];
      Integer indexOfB = record.get(b);
      if (indexOfB != null) {
        return new int[]{i, indexOfB};
      } else {
        record.put(nums[i], i);
      }
    }
    return null;
  }
}
