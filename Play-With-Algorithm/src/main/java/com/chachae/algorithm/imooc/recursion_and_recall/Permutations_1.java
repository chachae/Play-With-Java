package com.chachae.algorithm.imooc.recursion_and_recall;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/ 回溯算法启蒙
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 15:07
 */
public class Permutations_1 {

  private final List<List<Integer>> res = new ArrayList<>();
  private boolean[] used;

  private void buildPermute(int[] nums, int index, LinkedList<Integer> association) {
    if (index == nums.length) {
      res.add(new ArrayList<>(association));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!used[i]) {
        association.addLast(nums[i]);
        used[i] = true;
        buildPermute(nums, index + 1, association);
        association.removeLast();
        used[i] = false;
      }
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    if (nums != null && nums.length != 0) {
      used = new boolean[nums.length];
      buildPermute(nums, 0, new LinkedList<>());
    }
    return res;
  }
}
