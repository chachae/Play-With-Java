package com.chachae.design.creational.abstract_factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:02
 */
public class LaptopFactory extends AbstractFactory {

  @Override
  public Mobile createMobile(String supplier) {
    return null;
  }

  @Override
  public Laptop createLaptop(String supplier) {
    if (supplier.equals("huawei")) {
      return new HuaWeiLaptop();
    } else {
      return new AppleLaptop();
    }
  }
}
