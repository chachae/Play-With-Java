package com.chachae.design.behaviour.strategy;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 11:04
 */
public class Context {

  private TravelStrategy travelStrategy;

  public TravelStrategy travelStrategy() {
    return travelStrategy;
  }

  public void setTravelStrategy(TravelStrategy travelStrategy) {
    this.travelStrategy = travelStrategy;
  }

  public void travelModel() {
    this.travelStrategy.travelModel();
  }
}
