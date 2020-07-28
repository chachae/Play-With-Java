package com.chachae.design.behaviour.memento;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:33
 */
public class Memento {

  private String value;

  public Memento(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
