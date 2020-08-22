package com.chachae.design.structural.decorator;

/**
 * 装饰器模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    Decorator decorator = new Decorator(new Source());
    decorator.createComputer();
  }
}
