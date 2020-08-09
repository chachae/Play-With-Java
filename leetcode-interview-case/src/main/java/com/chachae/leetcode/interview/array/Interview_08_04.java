package com.chachae.leetcode.interview.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/power-set-lcci/">面试题 08.04. 幂集</a>
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 23:12
 */
public class Interview_08_04 {

  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 3};
    System.out.println(new Interview_08_04().subsets(nums));
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<Integer> sonCollection = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    cut(nums, 0, result, sonCollection);
    return result;
  }

  public void cut(int[] nums, int index, List<List<Integer>> result, List<Integer> es) {
    result.add(new ArrayList<>(es));
    for (int i = index; i < nums.length; i++) {
      es.add(nums[i]);
      cut(nums, ++index, result, es);
      es.remove(es.size() - 1);
    }
  }
}
