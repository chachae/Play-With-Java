package com.chachae.leetcode.No_0860;

/**
 * https://leetcode-cn.com/problems/lemonade-change/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public boolean lemonadeChange(int[] bills) {
    int five = 0;
    int ten = 0;
    for (int bill : bills) {
      switch (bill) {
        case 5:
          ++five;
          break;
        case 10:
          --five;
          ++ten;
          break;
        default:
          if (ten > 0) {
            --ten;
            --five;
          } else {
            five -= 3;
          }
      }
      if (five < 0) {
        return false;
      }
    }
    return true;
  }
}