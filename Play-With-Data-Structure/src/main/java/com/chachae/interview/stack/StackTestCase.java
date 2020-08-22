package com.chachae.interview.stack;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/6/17 21:01
 */
public class StackTestCase {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>(2);
    stack.push(1);
    stack.push(2);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    stack.push(10);
    System.out.println(stack.peek());
    System.out.println(stack.pop());

  }

}
