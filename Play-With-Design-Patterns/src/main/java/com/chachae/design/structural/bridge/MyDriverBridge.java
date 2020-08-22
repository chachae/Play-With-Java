package com.chachae.design.structural.bridge;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:31
 */
public class MyDriverBridge extends DriverMangerBridge {

  @Override
  public void execute() {
    getDriver().executeSQL();
  }
}
