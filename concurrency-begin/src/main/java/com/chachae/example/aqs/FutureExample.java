package com.chachae.example.aqs;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author chachae
 * @date 2019/11/12 9:43
 */
@Slf4j
public class FutureExample {

  static class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
      log.info("do something in callable");
      // 休眠 5s
      Thread.sleep(5000);
      // 返回操作结果
      return "Done";
    }
  }

  public static void main(String[] args) throws Exception {
    ExecutorService executorService = ThreadUtil.newExecutor();
    Future<String> future = executorService.submit(new MyCallable());
    log.info("do something in main");
    Thread.sleep(1000);
    // 从 future 从获取操作结果，5s
    String result = future.get();
    log.info("result : {}", result);
  }
}
