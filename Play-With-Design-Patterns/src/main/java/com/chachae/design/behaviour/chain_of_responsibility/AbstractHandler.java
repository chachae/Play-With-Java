package com.chachae.design.behaviour.chain_of_responsibility;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 17:49
 */
public abstract class AbstractHandler {

  private Handler handler;

  protected Handler getHandler() {
    return handler;
  }

  protected void setHandler(Handler handler) {
    this.handler = handler;
  }
}
