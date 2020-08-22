package com.chachae.algorithm.imooc.recursion_and_recall;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combinations/ (组合问题)
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/21 16:33
 */
public class Combinations {

  /**
   * 递归方法
   *
   * @param start 开始位置
   * @param n     结束位置
   * @param k     每个组合的元素个数
   * @param p     组合
   * @param res   所有组合的结果
   */
  private void buildCombination(int start, int n, int k, LinkedList<Integer> p, List<List<Integer>> res) {
    if (p.size() == k) {
      res.add(new LinkedList<>(p));
      return;
    }
    for (int i = start; i <= n - (k - p.size()) + 1; i++) {
      p.addLast(i);
      buildCombination(i + 1, n, k, p, res);
      p.removeLast();
    }
  }

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res = new LinkedList<>();
    if (k > 0 && n >= k) {
      buildCombination(1, n, k, new LinkedList<>(), res);
    }
    return res;
  }
}
