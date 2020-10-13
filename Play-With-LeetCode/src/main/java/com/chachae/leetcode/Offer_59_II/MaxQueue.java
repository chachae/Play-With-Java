package com.chachae.leetcode.Offer_59_II;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class MaxQueue {

  private Deque<Integer> queue;
  private Deque<Integer> help;

  public MaxQueue() {
    queue = new ArrayDeque<>();
    help = new ArrayDeque<>();
  }

  public int max_value() {
    return queue.isEmpty() ? -1 : help.peek();
  }

  public void push_back(int value) {
    queue.offer(value);
    while (!help.isEmpty() && value > help.peekLast()) {
      help.pollLast();
    }
    help.offer(value);
  }

  public int pop_front() {
    if (queue.isEmpty()) {
      return -1;
    }
    int val = queue.pop();
    if (help.peek() == val) {
      help.pop();
    }
    return val;
  }
}