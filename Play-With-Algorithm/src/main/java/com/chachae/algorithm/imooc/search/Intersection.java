package com.chachae.algorithm.imooc.search;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/18 15:26
 */
public class Intersection {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> res1 = new HashSet<>(nums1.length);
    Set<Integer> res2 = new HashSet<>(nums2.length);
    for (int e : nums1) {
      res1.add(e);
    }
    for (int e : nums2) {
      if (res1.contains(e)) {
        res2.add(e);
      }
    }

    int[] result = new int[res2.size()];
    Iterator<Integer> iterator = res2.iterator();
    int k = 0;
    while (iterator.hasNext()) {
      result[k++] = iterator.next();
    }

    return result;
  }
}
