package com.chachae.demo.singleton;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单例对象测试用例
 *
 * @author chachae
 * @since 2020/1/13 14:13
 */
@Slf4j
public class SingletonDemoTest {

  private static final Integer CLIENT_TOTAL = 100;
  private static final Integer THREAD_TOTAL = 5;
  private CountDownLatch countDownLatch = new CountDownLatch(CLIENT_TOTAL);
  private Semaphore semaphore = new Semaphore(THREAD_TOTAL);
  private AtomicInteger res = new AtomicInteger(0);

  @Test
  public void test() throws InterruptedException {

    threatPool();
  }

  public void threatPool() throws InterruptedException {

    ExecutorService executor = ThreadUtil.newExecutor(THREAD_TOTAL);

    executor.execute(
        () -> {
          for (int i = 1; i <= CLIENT_TOTAL; i++) {
            try {
              semaphore.acquire();
              res.incrementAndGet();
              System.out.println(i + " :Demo1 hashCode:" + SingletonDemo1.getInstance().hashCode());
              System.out.println(i + " :Demo2 hashCode:" + SingletonDemo2.getInstance().hashCode());
              System.out.println(i + " :Demo3 hashCode:" + SingletonDemo3.getInstance().hashCode());
              System.out.println(i + " :Demo4 hashCode:" + SingletonDemo4.getInstance().hashCode());
              semaphore.release();
            } catch (Exception e) {
              log.error("exception:", e);
            } finally {
              countDownLatch.countDown();
            }
          }
        });

    countDownLatch.await();
    executor.shutdown();
    log.info("finished -> {}", res.get());
  }
}
