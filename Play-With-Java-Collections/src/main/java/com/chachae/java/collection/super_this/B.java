package com.chachae.java.collection.super_this;

/**
 *
 * @author chachae
 * @date 2020/10/22 20:28
 * @version v1.0
 */
public class B extends A {

  public static void main(String[] args) {
    new B().test();
  }

  private void test() {
    new A().run();
    System.out.println(super.getClass().getSuperclass().getName());
  }
}
