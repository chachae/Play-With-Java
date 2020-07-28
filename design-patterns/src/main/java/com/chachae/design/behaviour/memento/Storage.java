package com.chachae.design.behaviour.memento;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/28 18:33
 */
public class Storage {

  private Memento memento;

  public Storage(Memento memento) {
    this.memento = memento;
  }

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
