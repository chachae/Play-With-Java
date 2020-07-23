package com.chachae.design.creational.builder.type_1;

import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 23:01
 */
public class ComputerDirector {

  public Computer build(ComputerBuilder computerBuilder) {
    computerBuilder.buildDisk();
    computerBuilder.buildCpu();
    computerBuilder.buildMemory();
    return computerBuilder.build();
  }
}
