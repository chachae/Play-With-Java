package com.chachae.example.lock;

import com.chachae.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * StampedLock
 *
 * @see <a href="https://segmentfault.com/a/1190000015808032?utm_source=tag-newest"/>
 * @author chachae
 * @date 2019/11/10 12:55
 */
@Slf4j
@ThreadSafe
public class LockExample6 {
  public static void main(String[] args) {
    ReentrantLock reentrantLock = new ReentrantLock();

    Condition condition = reentrantLock.newCondition();

    new Thread(
            () -> {
              try {
                reentrantLock.lock();
                log.info("wait signal"); // 1
                condition.await();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              log.info("get signal"); // 4
              reentrantLock.unlock();
            })
        .start();

    new Thread(
            () -> {
              reentrantLock.lock();
              log.info("get lock"); // 2
              try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              condition.signalAll();
              log.info("send signal ~ "); // 3
              reentrantLock.unlock();
            })
        .start();
  }
}
