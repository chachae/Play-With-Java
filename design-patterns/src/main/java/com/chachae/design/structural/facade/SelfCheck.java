package com.chachae.design.structural.facade;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:51
 */
public class SelfCheck implements Functionable {

  @Override
  public void startup() {
    System.out.println("SelfCheck startup");
  }

  @Override
  public void shutdown() {
    System.out.println("SelfCheck startup");
  }
}
