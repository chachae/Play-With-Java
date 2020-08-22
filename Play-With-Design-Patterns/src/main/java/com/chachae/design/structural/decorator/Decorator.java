package com.chachae.design.structural.decorator;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 11:12
 */
public class Decorator implements Sourceable {

  private final Source source;

  public Decorator(Source source){
    super();
    this.source = source;

  }
  @Override
  public void createComputer() {
    source.createComputer();
    System.out.println("install system");
  }
}
