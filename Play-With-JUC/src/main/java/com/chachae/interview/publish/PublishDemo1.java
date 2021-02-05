package com.chachae.interview.publish;

/**
 * @author chenyuexin
 * @date 2021/2/5 14:14
 * @version 1.0
 */
public class PublishDemo1 {

  private volatile static PublishDemo1 uniqueInstance;

  private PublishDemo1() {
    System.out.println("init.");
  }

  public static PublishDemo1 getInstance() {
    if (uniqueInstance == null) {
      synchronized (PublishDemo1.class) {
        if (uniqueInstance == null) {
          /**
           * uniqueInstance = new PublishDemo1();
           *
           * 1. 为 uniqueInstance 分配内存空间
           * 2. 初始化 uniqueInstance
           * 3. 将 uniqueInstance 指向分配的内存地址
           */
          uniqueInstance = new PublishDemo1();
        }
      }
    }
    return uniqueInstance;
  }

  public static void main(String[] args) {
    PublishDemo1 instance = PublishDemo1.getInstance();
    PublishDemo1 instance2 = PublishDemo1.getInstance();
    PublishDemo1 instance3 = PublishDemo1.getInstance();
    System.out.println(instance.toString());
    System.out.println(instance2.toString());
    System.out.println(instance3.toString());
  }
}
