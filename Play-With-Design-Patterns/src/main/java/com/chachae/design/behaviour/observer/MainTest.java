package com.chachae.design.behaviour.observer;

/**
 * 观察者（发布-订阅/模型-视图）模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 21:27
 */
public class MainTest {

  public static void main(String[] args) {
    Subject subject = new ConcreteSubject();
    Observer observer = new ConcreteObserver();
    subject.add(observer);
    subject.notifyObserver("hello");

    for (int i = 0; i < 5; i++) {
      subject.add(new ConcreteObserver());
    }

    subject.notifyObserver("hi");

    subject.remove(observer);
    subject.notifyObserver("after remove");
  }
}
