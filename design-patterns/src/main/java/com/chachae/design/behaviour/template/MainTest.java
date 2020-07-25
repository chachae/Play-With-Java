package com.chachae.design.behaviour.template;

/**
 * template 模板设计模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    AbstractTemplate t1 = new SaveMoney();
    t1.methodTemplate();

    AbstractTemplate t2 = new TakeMoney();
    t1.methodTemplate();
  }
}
