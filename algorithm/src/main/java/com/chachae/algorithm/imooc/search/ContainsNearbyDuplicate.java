package com.chachae.algorithm.imooc.search;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/18 22:27
 */
public class ContainsNearbyDuplicate {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> record = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (record.contains(nums[i])) {
        return true;
      }
      record.add(nums[i]);
      if (record.size() == k + 1) {
        record.remove(nums[i - k]);
      }
    }
    return false;
  }
}
