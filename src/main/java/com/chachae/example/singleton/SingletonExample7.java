package com.chachae.example.singleton;

import com.chachae.annotations.Recommend;
import com.chachae.annotations.ThreadSafe;

/**
 * 枚举 最安全
 *
 * <p>1. 相较于懒汉模式，它的安全性高<br>
 *
 * <p>2. 相较于饿汉模式，他保证只在第一次被使用时实例化，并且后续其他线程访问时可以直接获取其值
 *
 * @author chachae
 * @date 2019/9/27 10:24
 */
@Recommend
@ThreadSafe
public class SingletonExample7 {

  /** 私有构造 */
  private SingletonExample7() {}

  public static SingletonExample7 getInstance() {
    return Singleton.INSTANCE.getInstance();
  }

  private enum Singleton {
    //
    INSTANCE;

    private SingletonExample7 singleton;

    /** JVM 保证方法【绝对】只被调用一次 */
    Singleton() {
      singleton = new SingletonExample7();
    }

    public SingletonExample7 getInstance() {
      return singleton;
    }
  }
}
