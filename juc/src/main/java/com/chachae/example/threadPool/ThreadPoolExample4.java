package com.chachae.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author chachae
 * @date 2019/11/12 10:43
 */
@Slf4j
public class ThreadPoolExample4 {

  public static void main(String[] args) {

    // 调度线程池
    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    executorService.schedule(() -> log.warn("schedule run"), 3, TimeUnit.SECONDS);
    // 调度任务，用的比较多【指定速率】
    executorService.scheduleAtFixedRate(() -> log.warn("schedule run"), 1, 2, TimeUnit.SECONDS);
    // 调度任务【指定延时】
    // executorService.scheduleWithFixedDelay(() -> log.info("schedule run"), 1, 2,
    // TimeUnit.SECONDS);
    // 关闭线程池
    // executorService.shutdown();
  }
}
