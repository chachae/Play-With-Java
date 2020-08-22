package com.chachae.design.structural.flyweight;

/**
 * 享元模式（对象复用，减少对象的创建）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 10:40
 */
public class MainTest {

  public static void main(String[] args) {
    Memory memory = MemoryFactory.getMemory(32L);
    System.out.println(memory.toString());
    MemoryFactory.release(memory.getId());
    Memory memory2 = MemoryFactory.getMemory(32L);
    System.out.println(memory2.toString());
    Memory memory3 = MemoryFactory.getMemory(64L);
    System.out.println(memory3.toString());
  }
}
