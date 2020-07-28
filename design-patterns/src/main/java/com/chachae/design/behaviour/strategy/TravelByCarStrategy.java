package com.chachae.design.behaviour.strategy;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 11:02
 */
public class TravelByCarStrategy implements TravelStrategy {

  @Override
  public void travelModel() {
    System.out.println("travel by car");
  }
}
