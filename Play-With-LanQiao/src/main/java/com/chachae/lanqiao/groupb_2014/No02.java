package com.chachae.lanqiao.groupb_2014;

import java.util.Scanner;

/**
 *https://blog.csdn.net/hyx153183740/article/details/104163097
 *
 * @author chachae
 * @date 2020/10/5 21:20
 * @version v1.0
 */
public class No02 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    //通过多次实验发现满足下列规律
    int res = (int) (Math.pow(2, n) + 1);
    System.out.println(res);
  }

}
