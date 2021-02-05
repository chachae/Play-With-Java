/**
 * @author chenyuexin
 * @date 2021/2/5 15:11
 * @version 1.0
 */
package com.chachae.interview.thread_pool;

/**
 *ThreadPoolExecutor 3 个最重要的参数：
 * corePoolSize : 核⼼线程数线程数定义了最⼩可以同时运⾏的线程数量。
 * maximumPoolSize : 当队列中存放的任务达到队列容量的时候，当前可以同时运⾏的线程数
 * 量变为最⼤线程数。
 * workQueue : 当新任务来的时候会先判断当前运⾏的线程数量是否达到核⼼线程数，如果达
 * 到的话，新任务就会被存放在队列中。
 * ThreadPoolExecutor 其他常⻅参数:
 * 1. keepAliveTime :当线程池中的线程数量⼤于 corePoolSize 的时候，如果这时没有新的任务
 * 提交，核⼼线程外的线程不会⽴即销毁，⽽是会等待，直到等待的时间超过了
 * keepAliveTime 才会被回收销毁；
 * 2. unit : keepAliveTime 参数的时间单位。
 * 3. threadFactory :executor 创建新线程的时候会⽤到。
 * 4. handler :饱和策略。关于饱和策略下⾯单独介绍⼀下。
 *
 * */