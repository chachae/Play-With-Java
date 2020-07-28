package com.chachae.design.behaviour.visitor;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:40
 */
public interface Element {

  void accept(Visitor visitor);

}
