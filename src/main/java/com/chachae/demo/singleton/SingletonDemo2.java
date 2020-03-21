package com.chachae.demo.singleton;

import com.chachae.annoations.ThreadSafe;

/**
 * 饿汉模式
 *
 * @author chachae
 * @since 2020/1/13 10:50
 */
@ThreadSafe
public class SingletonDemo2 {

  /** 私有构造，禁止外部直接创建对象 */
  private SingletonDemo2() {}

  /** 初始化对象 */
  private static volatile SingletonDemo2 instance = new SingletonDemo2();

  public static SingletonDemo2 getInstance() {
    return instance;
  }
}
