package com.chachae.leetcode.Offer_09;

import java.util.LinkedList;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class CQueue {

  LinkedList<Integer> stack1;
  LinkedList<Integer> stack2;

  public CQueue() {
    stack1 = new LinkedList<>();
    stack2 = new LinkedList<>();
  }

  public void appendTail(int value) {
    stack1.add(value);
  }

  public int deleteHead() {
    if (stack2.isEmpty()) {
      if (stack1.isEmpty()) {
        return -1;
      }

      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    return stack2.pop();
  }
}
