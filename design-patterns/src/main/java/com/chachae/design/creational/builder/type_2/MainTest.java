package com.chachae.design.creational.builder.type_2;

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
    ComputerConcreteBuilder builder = new ComputerConcreteBuilder();

    Computer computer = builder
        // cpu
        .cpu("intel i9-109900K")
        // 内存
        .memory("32 GB")
        // 存储介质
        .disk("2 TB")
        .build();

    log.info(computer.getCpu());
    log.info(computer.getMemory());
    log.info(computer.getDisk());
  }
}
