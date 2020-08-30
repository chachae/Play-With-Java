package com.chachae.leetcode.No_0136;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/single-number/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Entry::getValue));
    pq.addAll(map.entrySet());
    return pq.poll().getKey();
  }
}