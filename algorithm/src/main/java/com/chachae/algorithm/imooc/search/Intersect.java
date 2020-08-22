package com.chachae.algorithm.imooc.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/18 15:49
 */
public class Intersect {

  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> record = new HashMap<>(nums1.length);
    for (int e : nums1) {
      check(record, e);
    }

    List<Integer> res = new ArrayList<>();

    for (int e : nums2) {
      Integer value = record.get(e);
      if (value != null && value > 0) {
        res.add(e);
        record.put(e, --value);
      }
    }

    int[] result = new int[res.size()];
    Iterator<Integer> iterator = res.iterator();
    int k = 0;
    while (iterator.hasNext()) {
      result[k++] = iterator.next();
    }

    return result;
  }

  private void check(Map<Integer, Integer> record, Integer key) {
    Integer value = record.get(key);
    if (value == null) {
      record.put(key, 1);
    } else {
      record.put(key, ++value);
    }
  }

}
