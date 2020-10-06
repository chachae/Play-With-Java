package com.chachae.lanqiao.groupb_2013;

import java.util.Calendar;

/**
 *
 * https://blog.csdn.net/hyx153183740/article/details/104163057
 *
 * @author chachae
 * @date 2020/10/5 19:53
 * @version v1.0
 */
public class No01 {

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    for (int i = 1999; i < 10000; i += 100) {
      calendar.set(i, Calendar.DECEMBER, 31);
      if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
        System.out.println(i);
        break;
      }
    }
  }
}
