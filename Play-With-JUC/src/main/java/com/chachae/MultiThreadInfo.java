package com.chachae;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 *
 * @author chachae
 * @date 2020/10/20 21:59
 * @version v1.0
 */
public class MultiThreadInfo {

  public static void main(String[] args) {
    ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
    for (ThreadInfo threadInfo : threadInfos) {
      System.out.printf("[ %s ] %s%n", threadInfo.getThreadId(), threadInfo.getThreadName());
    }
    //[5] Attach Listener //添加事件
    //[4] Signal Dispatcher // 分发处理给 JVM 信号的线程
    //[3] Finalizer //调⽤对象 finalize ⽅法的线程
    //[2] Reference Handler //清除 reference 线程
    //[1] main //main 线程,程序⼊⼝
  }

}
