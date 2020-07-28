package com.chachae.design.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 21:16
 */
public abstract class Subject {

  protected final List<Observer> observers = new ArrayList<>();

  /**
   * 增加观察者
   */
  protected synchronized boolean add(Observer observer) {
    return observers.add(observer);
  }

  /**
   * 删除观察者
   */
  protected synchronized void remove(Observer observer) {
    observers.remove(observer);
  }

  /**
   * 发布订阅
   */
  protected abstract void notifyObserver(String message);

}
