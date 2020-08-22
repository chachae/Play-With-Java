package com.chachae.design.creational.singleton;

/**
 * 静态内部类（类的静态内部类在 jvm 中是唯一的）
 *
 * @author chachae
 * @version v1.0
 * @date 2020/7/23 16:30
 */
public class InnerClassSingleton {

  private InnerClassSingleton() {
  }

  private static class HOLDER {
    private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
  }

  public static InnerClassSingleton getInstance() {
    return HOLDER.INSTANCE;
  }
}
