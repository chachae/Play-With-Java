package com.chachae.lanqiao.nation_groupb_2019;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/13 12:52
 */
public class E {

  // 1,2
  private volatile static AtomicInteger ans = new AtomicInteger(3);
  private volatile static AtomicInteger count = new AtomicInteger(3);

  public static void main(String[] args) {
    new Thread(()-> calc(3,10)).start();
    new Thread(()-> calc(11,20)).start();
    new Thread(()-> calc(21,30)).start();
    new Thread(()-> calc(31,40)).start();
    new Thread(()-> calc(41,50)).start();
    new Thread(()-> calc(51,60)).start();
  }

  private static void calc(int start,int end)  {
    for (int i = start; i < 100000000 && count.get() <= end; i++) {
      boolean b = dec(i, count.get());
      if (b) {
        System.out.printf("s%s = %s%n", count, i);
        ans.addAndGet(i);
        count.incrementAndGet();
        i = 3;
      }
    }
    System.out.println(ans);
  }

  private static boolean dec(int m, int count) {
    int ans = 2;
    for (int i = 2; i < m; i++) {
      if (m % i == 0) {
        ++ans;
      }
    }
    return ans == count;
  }
}
