package com.chachae.example.singleton;

import com.chachae.annoations.NotThreadSafe;

/**
 * 懒汉模式 <br>
 * 单例实例在第一次使用时进行创建
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@NotThreadSafe
public class SingletonExample1 {

  private SingletonExample1() {}

  private static SingletonExample1 instance = null;

  /**
   * 多线程下线程不安全
   *
   * @return instance
   */
  public static SingletonExample1 getInstance() {
    if (instance == null) {
      instance = new SingletonExample1();
    }
    return instance;
  }
}
