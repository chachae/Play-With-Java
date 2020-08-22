package com.chachae.design.creational.singleton;

/**
 * 双重校验
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 18:06
 */
public class Lock2Singleton {

  private Lock2Singleton() {
  }

  /**
   * volatile 防止 jvm 优化引发指令重排
   */
  private static volatile Lock2Singleton singleton = null;


  public static Lock2Singleton getInstance() {

    if (singleton == null) {
      synchronized (Lock2Singleton.class) {
        if (singleton == null) {
          singleton = new Lock2Singleton();
        }
      }
    }
    return singleton;
  }

}
