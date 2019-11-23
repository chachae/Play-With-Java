package com.chachae.example.atomic;

import com.chachae.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author chachae
 * @date 2019/9/6 13:05
 */
@ThreadSafe
@Slf4j
public class AtomicExample5 {

  private static final AtomicIntegerFieldUpdater<AtomicExample5> UPDATE =
      AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class, "count");

  @Getter private volatile int count = 100;

  public static void main(String[] args) {

    AtomicExample5 atomicExample5 = new AtomicExample5();

    if (UPDATE.compareAndSet(atomicExample5, 100, 200)) {
      log.info("update success 1 : {}", atomicExample5.getCount());
    }
    if (UPDATE.compareAndSet(atomicExample5, 100, 200)) {
      log.info("update success 2 : {}", atomicExample5.getCount());
    } else {
      log.info("update fail : {}", atomicExample5.getCount());
    }
  }
}
