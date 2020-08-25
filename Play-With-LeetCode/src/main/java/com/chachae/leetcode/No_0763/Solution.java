package com.chachae.leetcode.No_0763;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/partition-labels/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    String nums = "ababcbacadefegdehijhklij";
    System.out.println("nums len: " + nums.length());
    System.out.println(new Solution().partitionLabels(nums));
  }

  public List<Integer> partitionLabels(String s) {
    List<Integer> res = new LinkedList<>();
    int idxOfStart = 0;
    int idxOfEnd = 0;
    int[] lastOfIdxCache = new int[26];
    for (int i = 0; i < s.length(); ++i) {
      lastOfIdxCache[s.charAt(i) - 'a'] = i;
    }
    while (true) {
      for (int i = idxOfStart; i <= idxOfEnd; ++i) {
        idxOfEnd = Math.max(idxOfEnd, lastOfIdxCache[s.charAt(i) - 'a']);
      }
      res.add(idxOfEnd - idxOfStart + 1);
      if (s.length() - 1 == idxOfEnd) {
        break;
      } else {
        idxOfStart = ++idxOfEnd;
      }
    }
    return res;
  }
}