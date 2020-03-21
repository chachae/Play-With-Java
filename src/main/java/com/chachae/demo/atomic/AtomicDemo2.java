package com.chachae.demo.atomic;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ABA 问题的复现
 *
 * @author chachae
 * @since 2020/1/12 21:44
 */
@Slf4j
public class AtomicDemo2 {

  private static AtomicInteger count = new AtomicInteger(1);

  public void compareModify() {
    log.info("compare modify method start");
    count.compareAndSet(1, 50);
  }

  public void modify() {
    log.info("modify method start");
    count.compareAndSet(1, 3);
    count.compareAndSet(3, 1);
  }

  @Test
  public void test() {

    Thread threadA = ThreadUtil.newThread(this::modify, "threadA");

    Thread threadB =
        ThreadUtil.newThread(
            () -> {
              try {
                Thread.sleep(2000);
                compareModify();
              } catch (Exception e) {
                log.info("exception:", e);
              }
            },
            "threadB");

    threadA.start();
    threadB.start();

    log.info("修改成功，新值为：{}", count.get());
  }
}
