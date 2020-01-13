package com.chachae.demo.singleton;

import com.chachae.annoations.ThreadSafe;

/**
 * 饿汉模式
 *
 * @author chachae
 * @since 2020/1/13 10:50
 */
@ThreadSafe
public class SingletonDemo3 {

  /** 私有构造，禁止外部直接创建对象 */
  private SingletonDemo3() {}

  /** 初始化对象 */
  private static volatile SingletonDemo3 instance;

  // 静态代码块初始化
  static {
    instance = new SingletonDemo3();
  }

  public static SingletonDemo3 getInstance() {
    return instance;
  }
}
