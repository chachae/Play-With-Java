package com.chachae.design.behaviour.command;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:23
 */
public class Invoker {

  private Command command;

  public void action(String commandMessage) {
    System.out.println("发送消息");
    command.execute(commandMessage);
  }

  public Invoker(Command command) {
    this.command = command;
  }

  public Command getCommand() {
    return command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }
}
