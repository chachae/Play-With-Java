package com.chachae.design.creational.builder.type_2;

import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 22:59
 */
public class ComputerConcreteBuilder implements Builder {

  private final Computer computer;

  public ComputerConcreteBuilder() {
    computer = new Computer();
  }

  @Override
  public Builder cpu(String cpu) {
    computer.setCpu(cpu);
    return this;
  }

  @Override
  public Builder memory(String memory) {
    computer.setMemory(memory);
    return this;
  }

  @Override
  public Builder disk(String disk) {
    computer.setDisk(disk);
    return this;
  }

  @Override
  public Computer build() {
    return computer;
  }
}
