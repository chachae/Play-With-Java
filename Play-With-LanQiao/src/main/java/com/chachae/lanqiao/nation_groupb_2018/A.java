package com.chachae.lanqiao.nation_groupb_2018;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 21:42
 */
public class A {

  public static void main(String[] args) {
    double x1 = 2.3, y1 = 2.5, x2 = 6.4, y2 = 3.1, x3 = 5.1, y3 = 7.2;
    //double x1=0,y1=0,x2=0,y2=1,x3=1,y3=0;
    double X1 = x2 - x1, Y1 = y2 - y1, X2 = x3 - x1, Y2 = y3 - y1;

    System.out.println((X1 * Y2 - X2 * Y1) / 2);
  }

}
