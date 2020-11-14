package com.chachae.lanqiao.nation_groupb_2016;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 11:54
 */
public class B {

  public static void main(String[] args) {
    dfs(0);
    System.out.println(ans / 8);

  }

  static int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
  static int ans = 0;

  static void dfs(int m) {
    if (m >= 9) {
      int c1 = a[0] + a[1] + a[2];
      int c2 = a[3] + a[4] + a[5];
      int c3 = a[6] + a[7] + a[8];
      int r1 = a[0] + a[3] + a[6];
      int r2 = a[1] + a[4] + a[7];
      int r3 = a[2] + a[5] + a[8];
      int x = a[0] + a[4] + a[8];
      int y = a[2] + a[4] + a[6];

      if (c1 == c2 || c1 == c3 || c1 == r1 || c1 == r2 || c1 == r3 || c1 == x || c1 == y) {
        return;
      }
      if (c2 == c3 || c2 == r1 || c2 == r2 || c2 == r3 || c2 == x || c2 == y) {
        return;
      }
      if (c3 == r1 || c3 == r2 || c3 == r3 || c3 == x || c3 == y) {
        return;
      }
      if (r1 == r2 || r1 == r3 || r1 == x || r1 == y) {
        return;
      }
      if (r2 == r3 || r2 == x || r2 == y) {
        return;
      }
      if (r3 == x || r3 == y || x == y) {
        return;
      }
      ans++;
      if (ans < 10) {
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println(a[3] + " " + a[4] + " " + a[5]);
        System.out.println(a[6] + " " + a[7] + " " + a[8]);
        System.out.println();
      }
      return;
    }

    for (int i = m; i < 9; i++) {
      swap(i, m);
      dfs(m + 1);
      swap(i, m);
    }


  }


  static void swap(int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

}
