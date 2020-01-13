package com.chachae.demo.singleton;

import com.chachae.annoations.ThreadSafe;

/**
 * 枚举模式
 *
 * @author chachae
 * @since 2020/1/13 10:50
 */
@ThreadSafe
public class SingletonDemo4 {

  private SingletonDemo4() {}

  public static SingletonDemo4 getInstance() {
    return Singleton.INSTANCE.instance;
  }

  private enum Singleton {

    //
    INSTANCE;

    private SingletonDemo4 instance;

    Singleton() {
      instance = new SingletonDemo4();
    }

    private SingletonDemo4 getInstance() {
      return instance;
    }
  }
}
