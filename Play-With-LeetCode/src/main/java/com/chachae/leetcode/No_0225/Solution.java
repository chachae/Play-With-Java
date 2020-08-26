package com.chachae.leetcode.No_0225;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class MyStack {

  private final Queue<Integer> inputQueue;

  /**
   * Initialize your data structure here.
   */
  public MyStack() {
    inputQueue = new LinkedList<>();
  }

  /**
   * Push element x onto stack.
   */
  public void push(int x) {
    inputQueue.offer(x);
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    for (int i = 0; i < inputQueue.size() - 1; i++) {
      inputQueue.offer(inputQueue.poll());
    }
    try {
      return inputQueue.poll();
    } catch (NullPointerException e) {
      return Integer.MIN_VALUE;
    }
  }

  /**
   * Get the top element.
   */
  public int top() {
    Iterator<Integer> iterator = inputQueue.iterator();
    int top = 0;
    while (iterator.hasNext()) {
      top = iterator.next();
    }
    return top;
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return inputQueue.isEmpty();
  }
}
