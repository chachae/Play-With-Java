package com.chachae.design.creational.singleton;

/**
 * 懒汉
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:13
 */
public class LazySingleton {

  private LazySingleton() {
  }

  private static LazySingleton singleton = null;

  public static synchronized LazySingleton getInstance() {
    if(singleton == null){
      singleton = new LazySingleton();
    }
    return singleton;
  }
}
