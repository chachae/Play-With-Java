package com.chachae.lanqiao.acwing;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.acwing.com/problem/content/95/
 *
 * @author chachae
 * @date 2020/10/5 12:13
 * @version v1.0
 */
public class Acwing93 {

  private static boolean[] vis;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 5
    int k = sc.nextInt(); // 3
    vis = new boolean[n + 1];
    dfs(1, n, k, new LinkedList<>());
  }

  private static void dfs(int start, int end, int len, LinkedList<Integer> path) {
    if (path.size() == len) {
      System.out.println(path.stream().map(String::valueOf).collect(Collectors.joining(" ")));
      return;
    }

    if (path.size() > len) {
      return;
    }

    for (int i = start; i <= end; i++) {
      if (!vis[i]) {
        vis[i] = true;
        path.addLast(i);
        dfs(i + 1, end, len, path);
        path.removeLast();
        vis[i] = false;
      }
    }
  }
}

