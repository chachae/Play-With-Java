package com.chachae.lanqiao.groupb_2013;

/**
 *
 * @author chachae
 * @date 2020/10/5 19:58
 * @version v1.0
 */
public class No03 {

  public static void main(String[] args) {
    int ans;
    ans = dfs(0, 0);
    System.out.println(ans);
  }

  private static int dfs(int x, int y) {
    if (x == 3 || y == 4) {
      return 1;
    } else {
      return dfs(x + 1, y) + dfs(x, y + 1);
    }
  }
}