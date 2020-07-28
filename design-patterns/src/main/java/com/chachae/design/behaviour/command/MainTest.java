package com.chachae.design.behaviour.command;

/**
 * 命令模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConnectCommand(receiver);
    Invoker invoker = new Invoker(command);
    invoker.action("mysql -uroot -p666666");
  }
}
