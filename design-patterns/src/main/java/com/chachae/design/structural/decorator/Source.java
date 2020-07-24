package com.chachae.design.structural.decorator;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 11:12
 */
public class Source implements Sourceable {

  @Override
  public void createComputer() {
    System.out.println("create computer by Source");
  }
}
