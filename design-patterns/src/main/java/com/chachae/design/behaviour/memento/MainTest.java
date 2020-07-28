package com.chachae.design.behaviour.memento;

/**
 * 备忘录（快照）模式
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    // 创建原始类
    Original original = new Original("Sui");
    System.out.println(original.getValue());

    // 创建原始类备忘录
    Memento memento  = new Memento(original.getValue());
    Storage storage = new Storage(memento);

    // 修改原始类 value
    original.setValue("Joe");
    System.out.println(original.getValue());

    // 恢复数据
    original.restoreMemento(storage.getMemento());
    System.out.println(original.getValue());
  }
}
