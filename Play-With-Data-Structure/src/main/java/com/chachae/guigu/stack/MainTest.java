package com.chachae.guigu.stack;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/29 12:06
 */
public class MainTest {

  public static void main(String[] args) {
    ArrayStack<Integer> stack = new ArrayStack<>();
    for (int i = 0; i < 30; i++) {
      stack.push(i);
    }

    System.out.println(stack.toString());

    for (int i = 0; i < 10; i++) {
      System.out.printf("%d ", stack.pop());
    }

    System.out.println(stack.peek());
    System.out.println(stack.toString());
  }
}
