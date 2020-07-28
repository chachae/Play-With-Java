package com.chachae.design.behaviour.state;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:26
 */
public class HolidayState implements IState {

  @Override
  public void action() {
    System.out.println("睡觉");
  }
}
