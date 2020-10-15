package com.chachae.lanqiao.test_2020_10_15;

/**
 *
 * @author chachae
 * @date 2020/10/15 18:39
 * @version v1.0
 */
public class D {

  private static int sum;
  private static int cnt = Integer.MAX_VALUE;
  private static final int[] value = new int[15];
  private static final int[] nums = {9090400, 8499400, 5926800, 8547000, 4958200, 4422600,
      5751200, 4175600, 6309600, 5865200, 6604400, 4635000, 10663400, 8087200, 4554000};

  public static void main(String[] args) {

    for (int i = 0; i < 15; i++) {
      value[i] = nums[i];
      sum += value[i];
    }
    dfs(0, 0);
    System.out.println(cnt);
  }

  private static void dfs(int d, int v) {
    if (d == 15) {
      cnt = Math.min(cnt, Math.abs(sum - 2 * v));
    } else {
      dfs(d + 1, v + value[d]);
      dfs(d + 1, v);
    }
  }
}