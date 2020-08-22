package com.chachae.algorithm.imooc.search;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/4sum-ii/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/18 21:10
 */
public class FourSumCount {

  private void check(Map<Integer, Integer> map, Integer cdSum) {
    Integer count = map.get(cdSum);
    if (count != null) {
      map.put(cdSum, ++count);
    } else {
      map.put(cdSum, 1);
    }
  }


  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

    int res = 0;

    Map<Integer, Integer> cdMap = new HashMap<>(C.length * D.length);
    for (int j : C) {
      for (int k : D) {
        check(cdMap, j + k);
      }
    }

    for (int j : A) {
      for (int k : B) {
        Integer count = cdMap.get(-(j + k));
        if (count != null) {
          res += count;
        }
      }
    }
    return res;
  }
}
