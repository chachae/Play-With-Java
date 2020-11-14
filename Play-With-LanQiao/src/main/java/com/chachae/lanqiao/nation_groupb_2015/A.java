package com.chachae.lanqiao.nation_groupb_2015;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 10:46
 */
public class A {

  public static void main(String[] args) {
    int ans = 0;
    for (int i = 9; i >= 0; i--) {
      for (int j = 8; j >= 0; j--) {
        if (i > j) {
          for (int k = 7; k >= 0; k--) {
            if (i != k && j > k) {
              ++ans;
            }
          }
        }
      }
    }
    System.out.println(ans);
  }

}
