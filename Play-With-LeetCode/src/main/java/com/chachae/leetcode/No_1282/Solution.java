package com.chachae.leetcode.No_1282;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/group-the-people-given-the-group-size-they-belong-to/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    List<List<Integer>> list = new ArrayList<>();
    int[] array = new int[500];
    int index = 1;
    for (int i = 0; i < groupSizes.length; i++) {
      if (array[groupSizes[i]] == 0 || list.get(array[groupSizes[i]] - 1).size() == groupSizes[i]) {
        list.add(new ArrayList<>());
        array[groupSizes[i]] = index++;
      }
      list.get(array[groupSizes[i]] - 1).add(i);
    }
    return list;
  }
}