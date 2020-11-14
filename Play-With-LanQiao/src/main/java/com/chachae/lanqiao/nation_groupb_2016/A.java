package com.chachae.lanqiao.nation_groupb_2016;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 11:27
 */
public class A {

  public static void main(String[] args) {

    int A = 0, B = 1000, x = 0, flag = 1, ans = 0;
    while (B - A > 1) {
      x += 50 * flag;
      A += 10;
      B -= 10;
      if (x >= B) {
        flag = -flag;
        ans++;
        System.out.println(x + "  " + B + "  " + "!");
        x = B;

      } else if (x <= A) {
        // 一定要加else 因为在1s内不会同时撞2个板
        flag = -flag;
        ans++;
        System.out.println(x + "  " + A);
        x = A;
      }
    }

    System.out.println(ans);

  }

}
