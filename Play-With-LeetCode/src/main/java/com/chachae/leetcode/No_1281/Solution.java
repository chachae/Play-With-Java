package com.chachae.leetcode.No_1281;

/**
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int subtractProductAndSum(int n) {
    int a = 1;
    int b = 0;
    while (n > 0) {
      a *= n % 10;
      b += n % 10;
      n = n / 10;
    }
    return a - b;
  }
}