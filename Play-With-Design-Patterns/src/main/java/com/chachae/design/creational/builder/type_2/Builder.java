package com.chachae.design.creational.builder.type_2;

import com.chachae.design.creational.builder.Computer;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 23:13
 */
public interface Builder {

  Builder cpu(String cpu);

  Builder memory(String memory);

  Builder disk(String disk);

  Computer build();

}
