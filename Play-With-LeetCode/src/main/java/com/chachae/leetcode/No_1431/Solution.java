package com.chachae.leetcode.No_1431;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> res = new LinkedList<>();
    int max = Integer.MIN_VALUE;
    for (int candy : candies) {
      if (candy > max) {
        max = candy;
      }
    }

    for (int candy : candies) {
      if (candy >= max || (candy + extraCandies) >= max) {
        res.add(true);
      } else {
        res.add(false);
      }
    }
    return res;
  }
}