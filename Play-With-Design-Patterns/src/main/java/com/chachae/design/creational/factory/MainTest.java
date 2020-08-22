package com.chachae.design.creational.factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    Factory factory = new Factory();
    System.out.println(factory.create("xiaomi").brand());
    System.out.println(factory.create("huawei").brand());
  }
}
