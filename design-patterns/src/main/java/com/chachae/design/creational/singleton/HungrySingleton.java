package com.chachae.design.creational.singleton;

/**
 * 饿汉
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:13
 */
public class HungrySingleton {

  private HungrySingleton() {
  }

  private static final HungrySingleton SINGLETON;

  /**
   * 静态代码块优先加载
   */
  static {
    SINGLETON = new HungrySingleton();
  }

  public static HungrySingleton getInstance() {
    return SINGLETON;
  }

}
