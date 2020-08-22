package com.chachae.algorithm.imooc.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/non-overlapping-intervals/
 * <p>
 * [ [1,3],[1,2] ，[5,6]，[6,7]]
 * <p>
 * 贪心
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 17:18
 */
public class NonOverlappingIntervals {

  public int eraseOverlapIntervals(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
      return 0;
    }
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    int count = 0;
    int last = intervals[0][1];
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < last) {
        last = Math.min(last, intervals[i][1]);
        count++;
      } else {
        last = intervals[i][1];
      }
    }
    return count;
  }
}
