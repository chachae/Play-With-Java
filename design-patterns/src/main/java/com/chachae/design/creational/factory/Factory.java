package com.chachae.design.creational.factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:46
 */
public class Factory {

  public Mobile create(String supplierName) {
    if (supplierName.equals("xiaomi")) {
      return new XiaoMiMobile();
    } else {
      return new HuaWeiMoblie();
    }
  }
}
