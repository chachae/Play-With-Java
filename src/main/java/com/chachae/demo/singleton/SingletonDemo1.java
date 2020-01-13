package com.chachae.demo.singleton;

import cn.hutool.core.thread.ThreadUtil;
import com.chachae.annoations.ThreadSafe;

/**
 * 懒汉模式
 *
 * @author chachae
 * @since 2020/1/13 10:50
 */
@ThreadSafe
public class SingletonDemo1 {

  /** 私有构造，禁止外部直接创建对象 */
  private SingletonDemo1() {}

  /** 初始化对象，【volatile 可以保证不会发生JVM 优化带来的指令重排问题】 */
  private static volatile SingletonDemo1 instance = null;

  public static SingletonDemo1 getInstance() {
    if (instance == null) {
      // 同步锁，单独锁类
      synchronized (SingletonDemo1.class) {
        // 双重检测
        if (instance == null) {
          instance = new SingletonDemo1();
        }
      }
    }
    return instance;
  }
}
