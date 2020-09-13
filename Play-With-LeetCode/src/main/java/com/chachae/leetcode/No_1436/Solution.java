package com.chachae.leetcode.No_1436;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/destination-city/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static String destCity(List<List<String>> paths) {
    Map<String, Integer> map = new HashMap<>();
    for (List<String> list : paths) {
      map.put(list.get(0), 1);
    }
    for (List<String> list : paths) {
      if (map.get(list.get(1)) == null) {
        return list.get(1);
      }
    }
    return null;
  }
}