package com.chachae.example.atomic;

import com.chachae.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author chachae
 * @date 2019/9/6 13:05
 */
@NotThreadSafe
@Slf4j
public class AtomicExample4 {

  private static AtomicReference<Integer> count = new AtomicReference<>(0);

  public static void main(String[] args) {
    count.compareAndSet(0, 1);
    count.compareAndSet(0, 2);
    count.compareAndSet(1, 10);
    count.compareAndSet(10, 20);
    count.compareAndSet(10, 30);
    log.info("count:{}",count.get());
  }
}
