package com.chachae.jvm;

/**
 * @author chachae
 * @since 2020/3/26 12:04
 */
public class JvmNote {

  /**
   * 1. JVM系统架构图
   *
   * <p>2. 类加载器
   *        2.1 Bootstrap
   *        2.2 extensions
   *        2.3 System
   *        2.4 自定义加载器
   *
   * <p>3. Native
   *        3.1 关键字
   *        3.2 声明，没有实现，why？ 调用系统层
   *
   * <p>4. PC寄存器（程序计数器）
   *        4.1 记录方法间的调用情况，类似于排班值日表 用于存储指向下一条指令的地址，
   *        也即将要执行指 令代码，他是当前线程所执行的字节码的信号指示器
   *
   * <p>5. 方法区
   *        5.1 存储了每一个累的结构信息
   *        5.2 方法区是规范，在不同虚拟机中的实现不一样，最典型的就是永久代和元空间
   *
   *        空调 k1 = new 格力();
   *        List list = new ArrayList<>();
   *
   *        方法区 f = new 永久代
   *        方法区 f = new 元空间
   */
}
