package com.chachae.design.creational.builder.type_1;

import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 22:59
 */
public class ComputerConcreteBuilder implements ComputerBuilder {

  private final Computer computer;

  public ComputerConcreteBuilder() {
    computer = new Computer();
  }

  @Override
  public void buildCpu() {
    computer.setCpu("AMD 3950X");
  }

  @Override
  public void buildMemory() {
    computer.setMemory("16GB");
  }

  @Override
  public void buildDisk() {
    computer.setDisk("2TB");
  }

  @Override
  public Computer build() {
    return computer;
  }
}
