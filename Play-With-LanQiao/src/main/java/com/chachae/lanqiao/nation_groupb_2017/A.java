package com.chachae.lanqiao.nation_groupb_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/10 11:57
 */
public class A {

  private static final List<Long> ans = new ArrayList<>();
  private static final int[] rec = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

  public static void main(String[] args) {
    dfs(0);
    System.out.println(Collections.max(ans));
  }

  private static void dfs(int m) {
    if (m >= 10) {
      long res = 0;
      for (int i = 0; i < 10; i++) {
        res = 10 * res + rec[i];
      }
      long r = (long) Math.sqrt(res);
      if (("" + res).length() != 10) {
        return;
      }
      if (r * r == res) {
        ans.add(res);
      }
      return;
    }

    for (int i = m; i < 10; i++) {
      swap(i, m);
      dfs(m + 1);
      swap(i, m);
    }

  }


  private static void swap(int i, int j) {
    int t = rec[i];
    rec[i] = rec[j];
    rec[j] = t;
  }

}
