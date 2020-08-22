package com.chachae.design.creational.abstract_factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:00
 */
public abstract class AbstractFactory {

  public abstract Mobile createMobile(String supplier);

  public abstract Laptop createLaptop(String supplier);

}
