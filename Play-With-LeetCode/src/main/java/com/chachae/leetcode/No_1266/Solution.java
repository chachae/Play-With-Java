package com.chachae.leetcode.No_1266;

/**
 *
 * @author chachae
 * @date 2020/10/13 20:36
 * @version v1.0
 */
class Solution {

  public int minTimeToVisitAllPoints(int[][] points) {
    int num = points.length;
    int ans = 0;
    for (int i = 0; i < num - 1; i++) {
      ans += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
    }
    return ans;
  }
}