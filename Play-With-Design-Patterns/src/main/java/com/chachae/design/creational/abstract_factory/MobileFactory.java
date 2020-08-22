package com.chachae.design.creational.abstract_factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:02
 */
public class MobileFactory extends AbstractFactory {

  @Override
  public Mobile createMobile(String supplier) {
    if (supplier.equals("huawei")) {
      return new HuaWeiMobile();
    } else {
      return new AppleMobile();
    }
  }

  @Override
  public Laptop createLaptop(String supplier) {
    return null;
  }
}
