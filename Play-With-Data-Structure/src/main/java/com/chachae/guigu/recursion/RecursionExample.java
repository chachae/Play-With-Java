package com.chachae.guigu.recursion;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/8/3 10:14
 */
public class RecursionExample {

  public static void main(String[] args) {
    System.out.println(new RecursionExample().cal(100));
  }

  public void fun(int n) {
    if (n > 2) {
      fun(n - 1);
    }
    System.out.printf("n=%s%n", n);
  }

  public int cal(int n) {
    return n == 0 ? n : n + cal(n - 1);
  }
}
