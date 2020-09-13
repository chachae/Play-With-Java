package com.chachae.leetcode.No_1450;

/**
 * https://leetcode-cn.com/problems/number-of-students-doing-homework-at-a-given-time/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    int ans = 0;

    for (int i = 0; i < startTime.length; i++) {
      ans += startTime[i] <= queryTime && endTime[i] >= queryTime ? 1 : 0;
    }

    return ans;
  }
}