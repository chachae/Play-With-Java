package com.chachae.leetcode.No_0647;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  public int countSubstrings(String s) {
    int res = 0;
    int n = s.length();

    // dp[i][j] 表示[i,j]的字符是否为回文子串
    boolean[][] dp = new boolean[n][n];

    // 注意，外层循环要倒着写，内层循环要正着写
    // 因为要求dp[i][j] 需要知道dp[i+1][j-1]
    for (int i = n - 1; i >= 0; i--) {
      for (int j = i; j < n; j++) {

        // (s.charAt(i)==s.charAt(j) 时，当元素个数为1,2,3个时，一定为回文子串
        if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
          dp[i][j] = true;
          res++;
        }
      }
    }

    return res;
  }
}