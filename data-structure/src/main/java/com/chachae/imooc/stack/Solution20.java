package com.chachae.imooc.stack;

import java.util.Stack;

/**
 * LeetCode第二十题
 *
 * @author chachae
 * @since 2020/4/7 21:53
 */
public class Solution20 {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char n = s.charAt(i);
      if (n == '(' || n == '[' || n == '{') {
        stack.push(n);
      } else {
        if (stack.isEmpty()) {
          return false;
        } else {
          Character popStack = stack.pop();
          if (popStack == '(' && n != ')') {
            return false;
          }

          if (popStack == '[' && n != ']') {
            return false;
          }

          if (popStack == '{' && n != '}') {
            return false;
          }
        }
      }
    }
    return !stack.isEmpty();
  }
}
