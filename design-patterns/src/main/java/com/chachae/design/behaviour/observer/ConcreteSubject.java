package com.chachae.design.behaviour.observer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:16
 */
public class ConcreteSubject extends Subject {

  /**
   * 发布订阅
   */
  public void notifyObserver(String message) {
    for (Observer observer : observers) {
      observer.dataChange(message);
    }
  }
}
