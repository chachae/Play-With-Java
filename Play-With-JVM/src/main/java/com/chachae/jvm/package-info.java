/**
 * @author chenyuexin
 * @date 2021/2/5 15:59
 * @version 1.0
 */
package com.chachae.jvm;

/***
 *JVM 垃圾回收：
 * Java 堆是垃圾收集器管理的主要区域，因此也被称作GC 堆（Garbage Collected Heap）.从垃
 * 圾回收的⻆度，由于现在收集器基本都采⽤分代垃圾收集算法，所以 Java 堆还可以细分为：新
 * ⽣代和⽼年代：再细致⼀点有：Eden空间，From Survivor，To Survivor 空间等。进⼀步划分的
 * ⽬的是更好地回收内存，或者更快地分配内存。
 *
 *
 *堆这⾥最容易出现的就是 OutOfMemoryError 错误，并且出现这种错误之后的表现形式还会有⼏
 * 种，⽐如：
 * 1. OutOfMemoryError: GC Overhead Limit Exceeded ： 当JVM花太多时间执⾏垃圾回收并且
 * 只能回收很少的堆空间时，就会发⽣此错误。
 * 2. java.lang.OutOfMemoryError: Java heap space :假如在创建新的对象时, 堆内存中的空间不⾜
 * 以存放新创建的对象, 就会引发 java.lang.OutOfMemoryError: Java heap space 错误。(和本机物
 * 理内存⽆关，和你配置的内存⼤⼩有关！)
 *
 *
 * 创建对象过程：
 * 1 类加载检查
 * 2 分配内存
 *  分配并发处理：
 *    1. CAS+失败重试
 *    2. TLAB
 * 3 初始化零值
 * 4 执行 init 方法
 *
 *
 * 对象访问方式：
 *  1 句柄
 *  2 直接指针
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */