package com.chachae.algorithm.imooc.recursion_and_recall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/subsets/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 17:29
 */
public class Subsets {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(new Subsets().subsets(nums));
  }

  private void buildSubsets(int[] nums, List<List<Integer>> res, LinkedList<Integer> p, int start) {
    res.add(new ArrayList<>(p));
    for (int i = start; i < nums.length; i++) {
      p.addLast(nums[i]);
      buildSubsets(nums, res, p, i + 1);
      p.removeLast();
    }
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();
    if (nums != null && nums.length > 0) {
      Arrays.sort(nums);
      buildSubsets(nums, res, new LinkedList<>(), 0);
    }
    return res;
  }
}
