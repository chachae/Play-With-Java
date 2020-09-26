package com.chachae.leetcode.No_0728;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/self-dividing-numbers/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new LinkedList<>();
    for (int i = left; i <= right; i++) {
      if (isDivisionMath(i)) {
        list.add(i);
      }
    }
    return list;
  }

  public boolean isDivisionMath(int n) {
    int value = n;
    while (value > 0) {
      if (value % 10 != 0 && n % (value % 10) == 0) {
        value /= 10;
      } else {
        return false;
      }
    }
    return true;
  }
}