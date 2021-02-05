/**
 * @author chenyuexin
 * @date 2021/2/5 13:42
 * @version 1.0
 */
package com.chachae.interview.sync.synchronized_analysis;

/**
 *
 * synchronized 关键字加到 static 静态⽅法和 synchronized(class) 代码块上都是是给 Class
 * 类上锁。
 * synchronized 关键字加到实例⽅法上是给对象实例上锁。
 * 尽量不要使⽤ synchronized(String a) 因为 JVM 中，字符串常量池具有缓存功能！
 *
 * */