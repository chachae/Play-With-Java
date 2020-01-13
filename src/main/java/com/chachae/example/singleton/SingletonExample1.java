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

  /**
   * 私有构造
   *
   * <p>禁止外部创建对象
   */
  private SingletonExample1() {}

  /** 私有对象 */
  private static SingletonExample1 instance = null;

  /**
   * 多线程下不安全
   *
   * <p>因为在多线程环境下，假设有两个线程同时执行到if (instance == null) 处，<br>
   * 则拿到的instance 都为null，因此会重复实例化一个新的对象
   *
   * @return SingletonExample1 对象
   */
  public static SingletonExample1 getInstance() {
    if (instance == null) {
      instance = new SingletonExample1();
    }
    return instance;
  }
}
