package com.chachae.lanqiao.nation_groupb_2019;

import java.util.Scanner;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/13 19:50
 */
public class F {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] s = in.next().toCharArray();
    char[] t = in.next().toCharArray();
    int tidx = 0;
    int ans = 0;
    int start = 0;
    for (int i = 0; i < t.length; i++) {
      int cans = 0;
      for (int j = start;j<s.length;j++) {
        if (tidx < t.length && t[tidx] == s[j]) {
          ++cans;
          ++tidx;
        }
      }
      ans = Math.max(ans,cans);
      tidx = start;
    }
    System.out.println(ans);
  }
}
