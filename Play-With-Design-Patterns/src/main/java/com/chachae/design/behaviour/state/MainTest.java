package com.chachae.design.behaviour.state;

/**
 * 策略模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    Context context = new Context(new HolidayState());
    context.action();
    context.setState(new WorkState());
    context.action();
  }
}
