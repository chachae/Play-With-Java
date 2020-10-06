package com.chachae.lanqiao.acwing;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * https://www.acwing.com/problem/content/94/
 *
 * @author chachae
 * @date 2020/10/6 10:42
 * @version v1.0
 */
public class Acwing92 {

  // 访问记录
  private static boolean[] vis;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int end = in.nextInt();
    in.close();
    vis = new boolean[end + 1];
    System.out.println();
    dfs(1, end, new LinkedList<>());
  }

  private static void dfs(int start, int end, LinkedList<Integer> path) {
    if (!path.isEmpty() && path.size() <= end) {
      String res = path.stream().map(String::valueOf).collect(Collectors.joining(" "));
      System.out.println(res);
    }

    // 超过与其长度再回溯
    if (path.size() > end) {
      return;
    }

    for (int i = start; i <= end; i++) {
      if (!vis[i]) {
        path.addLast(i);
        vis[i] = true;
        dfs(i + 1, end, path);
        path.removeLast();
        vis[i] = false;
      }
    }
  }
}
