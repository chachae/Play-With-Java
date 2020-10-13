package com.chachae.leetcode.Offer_45;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chachae
 * @date 2020/10/13 21:51
 * @version v1.0
 */
class Solution {

  public String minNumber(int[] nums) {
    List<String> records = new ArrayList<>();
    for (int num : nums) {
      records.add(String.valueOf(num));
    }
    records.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
    System.out.println(records);
    return String.join("", records);
  }
}