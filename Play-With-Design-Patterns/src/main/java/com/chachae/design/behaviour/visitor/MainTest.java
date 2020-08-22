package com.chachae.design.behaviour.visitor;

/**
 * 观察者设计模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    Element element = new ProjectElement("OES-Cloud", "online exam system");
    element.accept(new CTOVisitor());
    element.accept(new CEOVisitor());
  }
}
