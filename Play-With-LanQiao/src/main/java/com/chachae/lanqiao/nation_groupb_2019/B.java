package com.chachae.lanqiao.nation_groupb_2019;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/12 20:26
 */
public class B {

  static int sum;

  public static void main(String[] args) {
    dfs(2019, 0, 45);
    System.out.println(sum);
  }

  /**
   * 深搜平方和为2019的所有子集
   */
  private static void dfs(int num, int min, int max) {
    if (num < 0) {
      return;
    }
    if (num == 0) {
      sum++;
      return;
    }
    for (int i = min; i < max; i++) {
      //去重，保证下一位数字一定大于当前数字
      dfs(num - i * i, i + 1, max);
    }
  }
}