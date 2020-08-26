package com.chachae.leetcode.Offer_30;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/26 12:02
 */
class MinStack {

  Deque<Integer> stack;
  Deque<Integer> help;

  /**
   * initialize your data structure here.
   */
  public MinStack() {
    stack = new ArrayDeque<>();
    help = new ArrayDeque<>();
  }

  public void push(int x) {
    stack.push(x);
    if (help.isEmpty() || x <= help.peek()) {
      help.push(x);
    }
  }

  public void pop() {
    int e = stack.pop();
    if (e == help.peek()) {
      help.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int min() {
    return help.peek();
  }
}