package com.chachae.example.singleton;

import com.chachae.annotations.NotRecommend;
import com.chachae.annotations.ThreadSafe;

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
   * 使用 synchronized 修饰，可以保证该方法在同一时间内只能被一个线程所访问
   *
   * <p>会有性能问题发生，因为synchronized 关键的会带来性能开销.
   */
  public static synchronized SingletonExample3 getInstance() {
    if (instance == null) {
      instance = new SingletonExample3();
    }
    return instance;
  }
}
