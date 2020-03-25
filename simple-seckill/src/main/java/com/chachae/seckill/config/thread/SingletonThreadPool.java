package com.chachae.seckill.config.thread;

import com.chachae.seckill.util.SpringContextUtil;
import com.google.common.collect.Queues;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 单例线程池
 *
 * @author chachae
 * @since 2020/3/23 21:17
 */
public class SingletonThreadPool {

  private SingletonThreadPool() {}

  private static ThreadPoolExecutor executor;

  static {
    executor = new SingletonThreadPool().getPoll();
  }

  public static ThreadPoolExecutor getExecutor() {
    return executor;
  }

  private ThreadPoolExecutor getPoll() {
    TaskExecutionProperties props = SpringContextUtil.getBean(TaskExecutionProperties.class);
    return new ThreadPoolExecutor(
        props.getPool().getCoreSize(),
        props.getPool().getMaxSize(),
        props.getPool().getKeepAlive().getSeconds(),
        TimeUnit.SECONDS,
        Queues.newArrayBlockingQueue(props.getPool().getQueueCapacity()),
        new TheadFactoryName());
  }
}
