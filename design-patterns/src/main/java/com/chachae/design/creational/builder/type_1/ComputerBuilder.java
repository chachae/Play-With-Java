package com.chachae.design.creational.builder.type_1;

import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 22:58
 */
public interface ComputerBuilder {

  void buildCpu();

  void buildMemory();

  void buildDisk();

  Computer build();

}
