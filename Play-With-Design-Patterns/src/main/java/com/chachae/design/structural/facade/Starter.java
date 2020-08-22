package com.chachae.design.structural.facade;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 14:51
 */
public class Starter {

  private final Dashboard dashboard;
  private final Engine engine;
  private final SelfCheck selfCheck;

  public Starter() {
    this.dashboard = new Dashboard();
    this.engine = new Engine();
    this.selfCheck = new SelfCheck();
  }

  public void startup() {
    engine.startup();
    dashboard.startup();
    selfCheck.startup();
  }

  public void shutdown() {
    engine.shutdown();
    dashboard.shutdown();
    selfCheck.shutdown();
  }

}
