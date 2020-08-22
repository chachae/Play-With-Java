package com.chachae.design.structural.facade;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:51
 */
public class Dashboard implements Functionable {

  @Override
  public void startup() {
    System.out.println("Dashboard startup");
  }

  @Override
  public void shutdown() {
    System.out.println("Dashboard startup");
  }
}
