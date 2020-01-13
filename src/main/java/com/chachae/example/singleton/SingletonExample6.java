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

  /** 1. 私有构造 */
  private SingletonExample6() {}

  /** 2. 单例对象 */
  private static SingletonExample6 instance;

  // 3. 使用静态块创建对象
  static {
    instance = new SingletonExample6();
  }

  // 以上三步的顺序不能调换！

  /** 静态工厂方法 */
  private static SingletonExample6 getInstance() {
    return instance;
  }

  public static void main(String[] args) {
    // 执行hashCode 的值一样说明返回的是=同一个对象
    System.out.println(getInstance().hashCode());
    System.out.println(getInstance().hashCode());
  }
}
