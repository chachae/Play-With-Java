package com.chachae.lanqiao.groupb_2017;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chachae
 * @date 2020/10/10 16:32
 * @version v1.0
 */
public class No07 {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int time1 = sc.nextInt();
    int time2 = sc.nextInt();
    if (time1 < time2) {
      int temp = time2;
      time2 = time1;
      time1 = temp;
    }
    int y1 = time1 / 10000;
    int m1 = time1 % 10000 / 100;
    int d1 = time1 % 100;
    int y2 = time2 / 10000;
    int m2 = time2 % 10000 / 100;
    int d2 = time2 % 100;
    Date date1 = new Date(y1, m1, d1);
    Date date2 = new Date(y2, m2, d2);
    long days = (date1.getTime() - date2.getTime()) / (3600 * 24);
    System.out.println(days);
  }

}
