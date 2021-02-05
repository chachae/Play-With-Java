/**
 * <a href="https://blog.csdn.net/ywlmsm1224811/article/details/94022647">
 *   浅谈sleep、wait、yield、join区别
 * </a>
 *
 * @author chenyuexin
 * @date 2021/2/5 10:13
 * @version 1.0
 */
package com.chachae.interview.sleep_wait_yield_join;

/**
 * 两者最主要的区别在于： sleep() ⽅法没有释放锁，⽽ wait() ⽅法释放了锁 。
 * 两者都可以暂停线程的执⾏。
 * wait() 通常被⽤于线程间交互/通信， sleep() 通常被⽤于暂停执⾏。
 * wait() ⽅法被调⽤后，线程不会⾃动苏醒，需要别的线程调⽤同⼀个对象上的 notify() 或 者 notifyAll() ⽅法。 sleep() ⽅法执⾏完成后，线程会⾃动苏醒。或者可以使⽤ wait(long timeout) 超时后线程会⾃动苏醒.
 */
