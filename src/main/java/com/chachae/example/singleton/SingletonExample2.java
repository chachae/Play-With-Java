package com.chachae.example.singleton;

import com.chachae.annotations.ThreadSafe;

/**
 * 饿汉模式 <br>
 * 单例实例在类装载时进行创建
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@ThreadSafe
public class SingletonExample2 {

  /**
   * 1. 私有构造在实现的时候没有过多的处理【过多可能会出现性能问题】<br>
   * 2. 在实现的时候肯定会被使用，不会造成资源浪费
   */
  private SingletonExample2() {}

  private static SingletonExample2 instance = new SingletonExample2();

  public static SingletonExample2 getInstance() {
    return instance;
  }
}
