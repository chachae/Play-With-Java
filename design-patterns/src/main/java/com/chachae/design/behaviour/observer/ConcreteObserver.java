package com.chachae.design.behaviour.observer;

import cn.hutool.log.Log;

/**
 * 观察者实现
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:17
 */
public class ConcreteObserver implements Observer {

  private final Log log = Log.get();

  public void dataChange(String message) {
    log.info("the data change : {}", message);
  }
}
