package com.chachae.leetcode.No_1518;

/**
 * https://leetcode-cn.com/problems/water-bottles/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private int sum;

  private void getNum(int bts, int exchange) {
    if (bts == exchange) {
      ++sum;
      return;
    }
    if (bts < exchange) {
      return;
    }
    int newBts = bts / exchange;
    sum += newBts;
    getNum(newBts + bts % exchange, exchange);
  }

  public int numWaterBottles(int numBottles, int numExchange) {
    sum += numBottles;
    getNum(numBottles, numExchange);
    return sum;
  }
}