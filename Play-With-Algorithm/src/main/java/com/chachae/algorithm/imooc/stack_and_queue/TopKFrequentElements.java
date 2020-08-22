package com.chachae.algorithm.imooc.stack_and_queue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/comments/ 优先队列
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 15:46
 */
public class TopKFrequentElements {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Entry::getValue));
    for (Entry<Integer, Integer> entry : map.entrySet()) {
      pq.add(entry);
      if (pq.size() < k) {
        pq.poll();
      }
    }

    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = pq.poll().getKey();
    }
    return res;
  }
}
