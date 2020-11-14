package com.chachae.lanqiao.nation_groupb_2015;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 11:16
 */
public class B {


  public static void main(String[] args) {
    dfs(0);
    System.out.println(ans / 10);
  }

  static int[] a = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10, 12};
  static int ans = 0;

  private static void swap(int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private static void dfs(int m) {
    if (m >= 10) {
      if (a[1] + a[2] + a[3] + a[4] != a[0] + a[2] + a[5] + a[8]) {
        return;
      }
      if (a[1] + a[2] + a[3] + a[4] != a[0] + a[3] + a[6] + a[9]) {
        return;
      }
      if (a[1] + a[2] + a[3] + a[4] != a[1] + a[5] + a[7] + a[9]) {
        return;
      }
      if (a[1] + a[2] + a[3] + a[4] != a[4] + a[6] + a[7] + a[8]) {
        return;
      }
      ans++;

      return;
    }

    for (int i = m; i < 10; i++) {
      swap(i, m);
      dfs(m + 1);
      swap(i, m);
    }
  }

}