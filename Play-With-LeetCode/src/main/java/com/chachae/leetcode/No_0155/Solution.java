package com.chachae.leetcode.No_0155;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/min-stack/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class MinStack {

  private final LinkedList<Integer> list;
  private final PriorityQueue<Integer> min;

  /**
   * initialize your data structure here.
   */
  public MinStack() {
    list = new LinkedList<>();
    min = new PriorityQueue<>();
  }

  public void push(int x) {
    list.push(x);
    min.add(x);
  }

  public void pop() {
    min.remove(list.pop());
  }

  public int top() {
    return list.peek();
  }

  public int getMin() {
    return min.peek();
  }
}