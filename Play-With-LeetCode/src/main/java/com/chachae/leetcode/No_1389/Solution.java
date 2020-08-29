package com.chachae.leetcode.No_1389;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int[] createTargetArray(int[] nums, int[] index) {
    LinkedList<Integer> record = new LinkedList<>();
    for (int i = 0; i < index.length; i++) {
      record.add(index[i], nums[i]);
    }

    int i = 0;
    for (Integer e : record) {
      nums[i++] = e;
    }
    return nums;
  }
}