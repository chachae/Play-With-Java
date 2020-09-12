package com.chachae.leetcode.Offer_57_II;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/ （滑窗）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {

  public int[][] findContinuousSequence(int target) {

    int sum = 0;
    int left = 1;
    List<int[]> list = new ArrayList<>();
    for (int right = 1; right < target; right++) {
      sum += right;
      while (sum > target) {
        sum -= left++;
      }
      if (sum == target) {
        int[] path = new int[right - left + 1];
        for (int i = 0; i < path.length; i++) {
          path[i] = left + i;
        }
        list.add(path);
      }
    }

    int[][] ans = new int[list.size()][];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = list.get(i);
    }
    return ans;
  }
}