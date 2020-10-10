package com.chachae.lanqiao.groupb_2016;

/**
 *
 * @author chachae
 * @date 2020/10/10 14:04
 * @version v1.0
 */
public class No06 {

  private static int[] path;
  private static boolean[] vis;
  private static int ans;
  private static int total;

  public static void main(String[] args) {
    path = new int[10];
    total = 10;
    vis = new boolean[10];
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

    for (int i = 0; i < total; i++) {
      if (!vis[i]) {
        vis[i] = true;
        path[index] = i;
        dfs(index + 1);
        vis[i] = false;
      }
    }
  }


  private static boolean check(int[] arr) {
    if (Math.abs(arr[0] - arr[1]) == 1 || Math.abs(arr[0] - arr[3]) == 1 || Math.abs(arr[0] - arr[4]) == 1
        || Math.abs(arr[0] - arr[5]) == 1) {
      return false;
    }

    if (Math.abs(arr[1] - arr[2]) == 1 || Math.abs(arr[1] - arr[4]) == 1 || Math.abs(arr[1] - arr[5]) == 1
        || Math.abs(arr[1] - arr[6]) == 1) {
      return false;
    }

    if (Math.abs(arr[2] - arr[5]) == 1 || Math.abs(arr[2] - arr[6]) == 1) {
      return false;
    }

    if (Math.abs(arr[3] - arr[4]) == 1 || Math.abs(arr[3] - arr[7]) == 1 || Math.abs(arr[3] - arr[8]) == 1) {
      return false;
    }

    if (Math.abs(arr[4] - arr[5]) == 1 || Math.abs(arr[4] - arr[7]) == 1 || Math.abs(arr[4] - arr[8]) == 1 ||
        Math.abs(arr[4] - arr[9]) == 1) {
      return false;
    }

    if (Math.abs(arr[5] - arr[6]) == 1 || Math.abs(arr[5] - arr[8]) == 1 || Math.abs(arr[5] - arr[9]) == 1) {
      return false;
    }

    if (Math.abs(arr[6] - arr[9]) == 1) {
      return false;
    }

    if (Math.abs(arr[7] - arr[8]) == 1) {
      return false;
    }

    return Math.abs(arr[8] - arr[9]) != 1;
  }
}
