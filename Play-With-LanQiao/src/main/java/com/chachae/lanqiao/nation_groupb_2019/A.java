package com.chachae.lanqiao.nation_groupb_2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 21:43
 */
public class A {

  private static final char[][] arr = new char[30][50];
  private static int ans = 0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < 30; i++) {
      arr[i] = in.nextLine().toCharArray();
    }

    for (int a = 0; a < 3; a++) {
      for (int b = 0; b < arr[a].length; b++) {
        check(arr[a][b], a, b);
      }
    }
    System.out.println(ans);
  }

  private static void check(char m, int i, int j) {
    // 横
    for (int a = j + 1; a < 50; a++) {
      if (arr[i][a] > m) {
        ++ans;
      }
    }

    // 竖
    for (int a = i + 1; a < 30; a++) {
      if (arr[a][j] > m) {
        ++ans;
      }
    }

    // 右下
    for (int a = i + 1, b = j + 1; a < 30 && b < 50; a++, b++) {
      if (arr[a][b] > m) {
        ++ans;
      }
    }

    // 右下
    for (int a = i - 1, b = j + 1; a >= 0 && b < 50; a--, b++) {
      if (arr[a][b]  > m) {
        ++ans;
      }
    }

    // 左下
    for (int a = i + 1, b = j - 1; a < 30 && b >= 0; a++, b--) {
      if (arr[a][b] > m) {
        ++ans;
      }
    }
  }
}
