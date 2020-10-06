package com.chachae.lanqiao.acwing;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/95/
 *
 * @author chachae
 * @date 2020/10/5 12:13
 * @version v1.0
 */
public class Acwing93 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 5
    int k = sc.nextInt(); // 3
    dfs(1, n, k, new LinkedList<>());
  }

  static void dfs(int idx, int n, int k, LinkedList<Integer> path) {
    if (path.size() == k) {
      for (int e : path) {
        System.out.print(e + " ");
      }
      System.out.println();
      return;
    }
    if (idx > n) {
      return;
    }
    for (int i = idx; i <= n; i++) {
      path.addLast(i);
      dfs(i + 1, n, k, path);
      path.removeLast();
    }
  }
}