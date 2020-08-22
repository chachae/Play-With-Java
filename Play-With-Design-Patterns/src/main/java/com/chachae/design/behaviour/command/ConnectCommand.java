package com.chachae.design.behaviour.command;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:22
 */
public class ConnectCommand implements Command {

  private final Receiver receiver;

  public ConnectCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute(String commandMessage) {
    receiver.action(commandMessage);
  }
}
