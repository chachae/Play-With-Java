package com.chachae.lanqiao.groupb_2017;

/**
 *
 * @author chachae
 * @date 2020/10/10 16:05
 * @version v1.0
 */
public class No05 {

  static int len(int x) {
    if (x < 10) {
      return 1;
    }
    return len(x / 10) + 1;
  }

  // 取x的第k位数字
  static int f(int x, int k) {
    if (len(x) - k == 0) {
      return x % 10;
    }
    return f(x / 10, k);
  }

  public static void main(String[] args) {
    int x = 23513;
    System.out.println(f(x, 3));
  }
}