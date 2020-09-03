package com.chachae.leetcode.No_0232;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class MyQueue {

  private final LinkedList<Integer> a;// 输入栈
  private final LinkedList<Integer> b;// 输出栈

  public MyQueue() {
    a = new LinkedList<>();
    b = new LinkedList<>();
  }

  public void push(int x) {
    a.push(x);
  }

  public int pop() {
    // 如果b栈为空，则将a栈全部弹出并压入b栈中，然后b.pop()
    if (b.isEmpty()) {
      while (!a.isEmpty()) {
        b.push(a.pop());
      }
    }
    return b.pop();
  }

  public int peek() {
    if (b.isEmpty()) {
      while (!a.isEmpty()) {
        b.push(a.pop());
      }
    }
    return b.peek();
  }

  public boolean empty() {
    return a.isEmpty() && b.isEmpty();
  }
}
