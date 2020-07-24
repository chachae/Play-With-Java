package com.chachae.design.structural.bridge;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:31
 */
public abstract class DriverMangerBridge {

  private Driver driver;

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  abstract void execute();
}
