/**
 * @author chenyuexin
 * @date 2021/2/5 11:51
 * @version 1.0
 */
package com.chachae.interview.sync;

/**
 * 2.3.11. 说⼀说⾃⼰对于 synchronized 关键字的了解
 * synchronized 关键字解决的是多个线程之间访问资源的同步性， synchronized 关键字可以保证
 * 被它修饰的⽅法或者代码块在任意时刻只能有⼀个线程执⾏。
 * 另外，在 Java 早期版本中， synchronized 属于 重量级锁，效率低下。
 * 为什么呢？
 * 因为监视器锁（monitor）是依赖于底层的操作系统的 Mutex Lock 来实现的，Java 的线程是映
 * 射到操作系统的原⽣线程之上的。如果要挂起或者唤醒⼀个线程，都需要操作系统帮忙完成，⽽
 * 操作系统实现线程之间的切换时需要从⽤户态转换到内核态，这个状态之间的转换需要相对⽐᫾
 * ⻓的时间，时间成本相对᫾⾼。
 * 庆幸的是在 Java 6 之后 Java 官⽅对从 JVM 层⾯对 synchronized ᫾⼤优化，所以现在的
 * synchronized 锁效率也优化得很不错了。JDK1.6 对锁的实现引⼊了⼤量的优化，如⾃旋锁、适
 * 应性⾃旋锁、锁消除、锁粗化、偏向锁、轻量级锁等技术来减少锁操作的开销。
 * 所以，你会发现⽬前的话，不论是各种开源框架还是 JDK 源码都⼤量使⽤了 synchronized 关键字
 *
 *
 *
 *
 * */
