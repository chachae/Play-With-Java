package com.chachae.java.collection.assignment;

/**
 *
 * @author chachae
 * @date 2020/10/31 11:02
 * @version v1.0
 */
public class Demo {

  // 成员变量：没有任何修饰默认初始值
  private int a;

  // 成员变量：被final修饰必须显示地赋初值
  private final int b = 1;

  public static void main(String[] args) {

    // 局部变量：必须赋初值
    int c = 2;

    System.out.println(new Demo().a);
    System.out.println(new Demo().b);
    System.out.println(c);

  }

}
