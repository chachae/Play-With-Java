package com.chachae.algorithm.imooc.recursion_and_recall;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 15:07
 */
public class Permutations_2 {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    backtrack(res, new ArrayList<>(), nums);
    return res;
  }

  public void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums) {
    if (list.size() == nums.length) {
      res.add(new ArrayList<>(list));
      return;
    }
    for (int num : nums) {
      if (!list.contains(num)) {
        list.add(num);
        backtrack(res, list, nums);
        list.remove(list.size() - 1);
      }
    }
  }
}
