package com.chachae.design.creational.singleton;

/**
 * enum
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 21:35
 */
public class EnumSingleton {

  private enum innerEnum {

    INSTANCE;

    private final EnumSingleton singleton;

    innerEnum() {
      singleton = new EnumSingleton();
    }

    private EnumSingleton getSingleton() {
      return singleton;
    }

  }

  public static EnumSingleton getInstance() {
    return innerEnum.INSTANCE.getSingleton();
  }
}
