package com.chachae.design.behaviour.command;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:23
 */
public class Receiver {

  public void action(String commandMessage) {
    System.out.println("收到消息，正在执行");
    System.out.println(commandMessage);
  }
}
