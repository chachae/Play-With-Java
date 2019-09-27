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
public class SingletonExample6 {

  /** 私有构造 */
  private SingletonExample6() {}

  /** 单例对象 */
  private static SingletonExample6 instance;

  static {
    instance = new SingletonExample6();
  }

  /** 静态工厂方法 */
  private static SingletonExample6 getInstance() {
    return instance;
  }

  public static void main(String[] args) {
    System.out.println(getInstance().hashCode());
    System.out.println(getInstance().hashCode());
  }
}
