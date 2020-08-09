package com.chachae.leetcode.interview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/shift-2d-grid/comments/">1260. 二维网格迁移</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/30 22:45
 */
public class No1260 {

  public static void main(String[] args) {

  }

  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int[] nums = new int[grid.length * grid[0].length];
    for (int[] ints : grid) {
      for (int j = 0; j < grid[0].length; j++) {
        k %= nums.length;
        nums[k++] = ints[j];
      }
    }
    k = 0;
    List<List<Integer>> lists = new ArrayList<>(grid.length);
    for (int i = 0, iMax = grid.length; i < iMax; i++) {
      List<Integer> tempList = new ArrayList<>(grid[0].length);
      for (int j = 0, jMax = grid[0].length; j < jMax; j++) {
        tempList.add(nums[k++]);
      }
      lists.add(tempList);
    }
    return lists;
  }
}
