package com.chachae.design.creational.builder.type_1;

import cn.hutool.log.Log;
import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 22:37
 */
public class MainTest {

  private static final Log log = Log.get();

  public static void main(String[] args) {
    ComputerDirector computerDirector = new ComputerDirector();
    Computer computer = computerDirector.build(new ComputerConcreteBuilder());
    log.info(computer.getCpu());
    log.info(computer.getMemory());
    log.info(computer.getDisk());
  }
}
