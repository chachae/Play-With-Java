package com.chachae.example.singleton;

import com.chachae.annoations.Recommend;
import com.chachae.annoations.ThreadSafe;

/**
 * 枚举 最安全
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@Recommend
@ThreadSafe
public class SingletonExample7 {

  /** 私有构造 */
  private SingletonExample7() {}

  public SingletonExample7 getInstance() {
    return Singleton.INSTANCE.singleton;
  }

  private enum Singleton {
    //
    INSTANCE;

    private SingletonExample7 singleton;

    /** JVM 保证方法只被调用一次 */
    Singleton() {
      singleton = new SingletonExample7();
    }

    public SingletonExample7 getInstance() {
      return singleton;
    }
  }
}
