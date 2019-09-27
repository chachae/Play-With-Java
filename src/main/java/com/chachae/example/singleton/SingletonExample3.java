package com.chachae.example.singleton;

import com.chachae.annoations.NotRecommend;
import com.chachae.annoations.ThreadSafe;

/**
 * 懒汉模式 <br>
 * 单例实例在第一次使用时进行创建
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

  private SingletonExample3() {}

  private static SingletonExample3 instance = null;

  /**
   * 使用 synchronized 修饰，实现线程安全<br>
   * 性能问题
   */
  public static synchronized SingletonExample3 getInstance() {
    if (instance == null) {
      instance = new SingletonExample3();
    }
    return instance;
  }
}
