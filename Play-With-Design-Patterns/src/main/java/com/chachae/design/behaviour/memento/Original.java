package com.chachae.design.behaviour.memento;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:33
 */
public class Original {

  private String value;

  public Original(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Memento createMemento(String value) {
    return new Memento(value);
  }

  public void restoreMemento(Memento memento) {
    this.value = memento.getValue();
  }
}
