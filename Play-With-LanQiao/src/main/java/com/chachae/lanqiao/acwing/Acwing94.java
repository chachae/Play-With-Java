package com.chachae.lanqiao.acwing;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author chachae
 * @date 2020/10/6 11:42
 * @version v1.0
 */
public class Acwing94 {

  private static boolean[] vis;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int end = in.nextInt();
    in.close();
    vis = new boolean[end + 1];
    dfs(1, end, new LinkedList<>());
  }

  private static void dfs(int start, int end, LinkedList<Integer> path) {
    if (path.size() == end) {
      System.out.println(path.stream().map(String::valueOf).collect(Collectors.joining(" ")));
      return;
    }

    for (int i = 1; i <= end; i++) {
      if (!vis[i]) {
        vis[i] = true;
        path.addLast(i);
        dfs(start + 1, end, path);
        vis[i] = false;
        path.removeLast();
      }
    }

  }
}
