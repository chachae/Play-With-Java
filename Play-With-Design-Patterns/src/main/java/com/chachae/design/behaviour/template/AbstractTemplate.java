package com.chachae.design.behaviour.template;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 11:22
 */
public abstract class AbstractTemplate {

  public void methodTemplate() {
    checkNumber();
    queue();
    handleBusiness();
    serviceEvaluation();
  }

  private void checkNumber() {
    System.out.println("1. 抽号");
  }

  private void queue() {
    System.out.println("2. 排队");
  }

  protected abstract void handleBusiness();

  private void serviceEvaluation() {
    System.out.println("4. 服务评价");
  }

}
