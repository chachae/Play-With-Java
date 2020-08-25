package com.chachae.leetcode.No_1111;

/**
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public static void main(String[] args) {
    System.out.println(7 & 15);
  }

  public int[] maxDepthAfterSplit(String seq) {
    int[] res = new int[seq.length()];
    int idx = 0;
    for (char c : seq.toCharArray()) {
      res[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
    }
    return res;
  }
}