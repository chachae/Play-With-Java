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
public class SingletonExample4 {

  public SingletonExample4() {}

  /*
  1. memory = allocate() 分配对象内存空间
  2. ctorInstance() 初始化对象
  3. instance = memory 设置instance指向刚分配的内存.

  JVM和CPU优化，发生指令重排【指令重排是发成线程安全问题的主要因素】
  1. memory = allocate() 分配对象内存空间
  3. instance = memory 设置instance指向刚分配的内存
  2. ctorInstance() 初始化对象.
   */

  private static SingletonExample4 instance = null;

  /**
   * 静态工厂方法<br>
   * 使用 synchronized 修饰<br>
   * 双重检测机制
   */
  private static SingletonExample4 getInstance() {
    // 双重检测机制
    if (instance == null) {
      // 同步锁【单独锁这个类】
      synchronized (SingletonExample4.class) {
        if (instance == null) {
          instance = new SingletonExample4();
        }
      }
    }
    return instance;
  }
}
