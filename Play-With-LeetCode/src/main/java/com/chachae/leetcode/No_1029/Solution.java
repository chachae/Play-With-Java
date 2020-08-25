package com.chachae.leetcode.No_1029;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/two-city-scheduling/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    int[][] nums = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
    new Solution().twoCitySchedCost(nums);
  }

  public int twoCitySchedCost(int[][] costs) {
    int res = 0, len = costs.length;
    int[] cz = new int[len];
    for (int i = 0; i < len; i++) {
      res += costs[i][0];
      cz[i] = costs[i][1] - costs[i][0];
    }
    Arrays.sort(cz);
    for (int i = 0; i < len / 2; i++) {
      res += cz[i];
    }
    return res;
  }
}