package com.chachae.leetcode.Offer_31;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class Solution {
  //                    j
  // pushed = [1,2,3,4,5]
  //                  j
  // popped = [4,5,3,2,1]

  // record = [1,2,3]

  //                    h
  // pushed = [2，1，0]
  //                   h
  // popped = [1，2，0]

  // record = []

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    LinkedList<Integer> stack = new LinkedList<>();
    int j = 0;
    for (int e : pushed) {
      stack.push(e);
      while (j < popped.length && !stack.isEmpty() && popped[j] == stack.peek()) {
        stack.pop();
        ++j;
      }
    }
    return j == popped.length;
  }
}