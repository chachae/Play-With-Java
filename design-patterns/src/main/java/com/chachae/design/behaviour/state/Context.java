package com.chachae.design.behaviour.state;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:26
 */
public class Context {

  private IState state;

  public Context(IState state) {
    this.state = state;
  }

  public IState getState() {
    return state;
  }

  public void setState(IState state) {
    this.state = state;
  }

  public void action() {
    this.state.action();
  }
}
