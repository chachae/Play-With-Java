package com.chachae.example.singleton;

import com.chachae.annoations.ThreadSafe;

/**
 * 饿汉模式 <br>
 * 单例实例在类装载时进行创建
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@ThreadSafe
public class SingletonExample2 {

  private SingletonExample2() {}

  private static SingletonExample2 instance = new SingletonExample2();

  public static SingletonExample2 getInstance() {
    return instance;
  }
}
