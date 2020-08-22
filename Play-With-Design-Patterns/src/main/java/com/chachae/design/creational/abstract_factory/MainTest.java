package com.chachae.design.creational.abstract_factory;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 15:53
 */
public class MainTest {

  public static void main(String[] args) {
    MobileFactory mobileFactory = new MobileFactory();
    System.out.println(mobileFactory.createMobile("xiaomi").call());
    System.out.println(mobileFactory.createMobile("huawei").call());

    LaptopFactory laptopFactory = new LaptopFactory();
    System.out.println(laptopFactory.createLaptop("xiaomi").call());
    System.out.println(laptopFactory.createLaptop("huawei").call());
  }
}
