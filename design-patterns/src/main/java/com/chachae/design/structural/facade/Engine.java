package com.chachae.design.structural.facade;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:49
 */
public class Engine implements Functionable {

  @Override
  public void startup() {
    System.out.println("engine startup");
  }

  @Override
  public void shutdown() {
    System.out.println("engine shutdown");
  }
}
