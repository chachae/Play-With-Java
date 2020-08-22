package com.chachae.algorithm.imooc.stack_and_queue;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/20 09:58
 */
public class ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (c == '{') {
        stack.push('}');
      } else if (stack.isEmpty() || c != stack.pop()) {
        return false;
      }
    }
    return stack.isEmpty();
  }
}
