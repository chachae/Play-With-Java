package com.chachae.lanqiao.groupb_2016;

/**
 *
 * @author chachae
 * @date 2020/10/10 12:40
 * @version v1.0
 */
public class No03 {

  private static final boolean[] vis = new boolean[10];
  private static int ans = 0;
  private static int[] path;
  private static int total;

  public static void main(String[] args) {
    path = new int[9];
    total = 9;
    dfs(0);
    System.out.println(ans);
  }

  public static void dfs(int index) {
    if (index == total) {
      if (check(path)) {
        ++ans;
      }
      return;
    }

    for (int i = 1; i <= total; i++) {
      if (!vis[i]) {
        vis[i] = true;
        path[index] = i;
        dfs(index + 1);
        vis[i] = false;
      }
    }
  }

  private static boolean check(int[] path) {
    int a = path[0];
    int b = path[1];
    int c = path[2];
    int def = path[3] * 100 + path[4] * 10 + path[5];
    int ghi = path[6] * 100 + path[7] * 10 + path[8];
    return (a * c * ghi) + (b * ghi) + (def * c) == 10 * c * ghi;
  }
}
