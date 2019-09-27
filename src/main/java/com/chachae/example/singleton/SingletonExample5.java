package com.chachae.example.singleton;

import com.chachae.annoations.NotThreadSafe;

/**
 * 懒汉模式 -> 双重同步锁单例模式 <br>
 * 单例实例在第一次使用时进行创建
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@NotThreadSafe
public class SingletonExample5 {

  private SingletonExample5() {}

  /**
   * 1. memory = allocate() 分配对象内存空间 2. ctorInstance() 初始化对象 3. instance = memory 设置instance指向刚分配的内存
   *
   * <p>volatile + 双重检测:防指指令重排
   */
  private static volatile SingletonExample5 instance = null;

  /**
   * 静态工厂方法<br>
   * 使用 synchronized 修饰<br>
   * 双重检测机制
   */
  private static synchronized SingletonExample5 getInstance() {
    // 双重检测
    if (instance == null) {
      // 同步锁
      synchronized (SingletonExample5.class) {
        if (instance == null) {
          instance = new SingletonExample5();
        }
      }
    }
    return instance;
  }
}
