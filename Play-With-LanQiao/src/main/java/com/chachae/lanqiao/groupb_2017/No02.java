package com.chachae.lanqiao.groupb_2017;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 第二题：纸牌三角形
 * 题目描述
 *
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。
 *
 * @author chachae
 * @date 2020/10/10 15:25
 * @version v1.0
 */
public class No02 {

  private static int total;
  private static boolean[] vis;
  private static int[] path;
  private static int ans;

  public static void main(String[] args) {
    total = 9;
    ans = 0;
    path = new int[total];
    vis = new boolean[10];
    dfs(0);
    System.out.printf("result : %s", ans / 6);
  }

  private static void dfs(int count) {
    if (count == 9) {
      if (check(path)) {
        ++ans;
      }
      return;
    }

    for (int i = 1; i <= total; i++) {
      if (!vis[i]) {
        vis[i] = true;
        path[count] = i;
        dfs(count + 1);
        vis[i] = false;
      }
    }
  }

  private static boolean check(int[] path) {
    int a = path[0] + path[1] + path[2] + path[3];
    int b = path[3] + path[4] + path[5] + path[6];
    int c = path[6] + path[7] + path[8] + path[0];
   return a == b && a == c;
  }
}
