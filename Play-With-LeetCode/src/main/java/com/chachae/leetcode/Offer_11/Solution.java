package com.chachae.leetcode.Offer_11;

import java.util.Arrays;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int minArray(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[0];
  }
}