package com.chachae.algorithm.imooc.greedy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/assign-cookies/
 * <p>
 * 输入: [1,2,3], [1,1]
 * <p>
 * 输出: 1
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 17:02
 */
public class AssignCookies {

  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int child = 0;
    int cookie = 0;
    while (g.length > child && s.length > cookie) {
      if (g[child] <= s[cookie]) {
        child++;
      }
      cookie++;
    }
    return child;
  }

}
