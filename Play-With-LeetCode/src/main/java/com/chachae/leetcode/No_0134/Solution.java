package com.chachae.leetcode.No_0134;

/**
 * https://leetcode-cn.com/problems/gas-station/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private boolean tryCircle(int idx, int len, int[] gas, int[] cost) {
    int curGas = gas[idx];
    int last;
    for (int i = 0; i < len; ++i) {
      if (curGas - cost[idx] > 0) {
        last = idx == len - 1 ? 0 : idx + 1;
        curGas -= cost[idx] - gas[last];
        idx = idx == len - 1 ? 0 : ++idx;
      } else {
        return curGas - cost[idx] == 0 && i == len - 1;
      }
    }
    return true;
  }

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int len = cost.length;
    if (len == 1 && gas[0] == cost[0]) {
      return 0;
    } else {
      for (int i = 0; i < len; i++) {
        if (gas[i] > cost[i] && tryCircle(i, len, gas, cost)) {
          return i;
        }
      }
    }
    return -1;
  }
}