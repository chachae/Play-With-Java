package com.chachae.design.structural.facade;

/**
 * 门面模式（外观）
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:54
 */
public class MainTest {

  public static void main(String[] args) {
    Starter starter = new Starter();
    starter.startup();
    System.out.println("**********");
    starter.shutdown();
  }
}
